package com.demo.controller;

import com.demo.model.Student;
import com.demo.model.Teacher;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teacher")
public class TeacherController {
    @Resource
    private Teacher teacher;
    @RequestMapping("get")
    public Teacher getTeacher()
    {
        return teacher;
    }
    @RequestMapping("getAvgGrade")
    public String getAvgGrade() {
        StringBuilder result = new StringBuilder();
        for (Student student : teacher.getStudents()) {
            double sum = 0;
            int count = 0;
            for (Integer grade : student.getScores().values()) {
                sum += grade;
                count++;
            }
            double avg = count > 0 ? sum / count : 0;
            result.append(student.getName()).append("的平均分: ").append(String.format("%.2f", avg)).append("\n");
        }
        return result.toString();
    }
    @RequestMapping("getYuWenAvg")
    public String getYuWenAvg() {
        double sum = 0;
        int count = 0;
        for (Student student : teacher.getStudents()) {
            Integer grade = student.getScores().get("语文");
            if (grade != null) {
                sum += grade;
                count++;
            }
        }
        double avg = count > 0 ? sum / count : 0;
        return "语文平均分: " + String.format("%.2f", avg);
    }


}
