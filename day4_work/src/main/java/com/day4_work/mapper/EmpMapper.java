package com.day4_work.mapper;

import com.day4_work.entity.Emp;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface EmpMapper {
    @Insert("insert into emp values(0,#{name},#{addr},#{dept},#{age})")
    public int insertEmp(Emp emp);
    @Delete("delete from emp where id=#{id}")
    public int deleteEmp(int id);
    @Delete("<script>" +
            "DELETE FROM emp " +
            "<where>" +
            "   <if test='id != null'> id = #{id} </if>" +
            "   <if test='name != null and name != \"\"'> AND name = #{name} </if>" +
            "   <if test='addr != null and addr != \"\"'> AND email = #{addr} </if>" +
            "   <if test='dept != null and dept != \"\"'> AND dept = #{dept} </if>" +
            "   <if test='age != null'> AND age = #{age} </if>" +
            "</where>" +
            "</script>")
    public int deleteByCondition(Emp emp);
    @Update("update emp set name=#{name},addr=#{addr},dept=#{dept},age=#{age} where id=#{id}")
    public int updateEmp(Emp emp);
    @Select("select * from emp")
    public List<Emp> selectEmp();
    @Select("select * from emp where id=#{id}")
    public Emp selectById(int id);

}
