import model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import java.io.IOException;
import java.util.List;

import mapper.StudentMapper;

public class TestMybatis {
    @Test
    public void testList() throws IOException {
        SqlSessionFactoryBuilder builder = new MybatisSqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(Resources.getResourceAsStream("SqlmapConfig.xml"));
        SqlSession session = factory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> list = mapper.selectList( null);
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("添加学生");
        Student student = new Student();
        student.setName("小五");
        student.setAge(20);
        student.setGender("男");
        mapper.insert(student);
        session.commit();
        System.out.println("添加成功");
        mapper.selectList(null).forEach(System.out::println);
        System.out.println("删除学生");
        student.setId(12);
        mapper.deleteById(student.getId());
        session.commit();
        System.out.println("删除成功");
        mapper.selectList(null).forEach(System.out::println);
        session.close();
    }

}
