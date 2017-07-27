package com.autotest;

import com.autotest.annotation.AutoTest;
import com.autotest.base.SpringTestBase;
import dal.model.Student;

/**
 * Created by ychaoyang on 2017/7/27.
 */
public class MybatisTest extends SpringTestBase{

    @AutoTest(file= "autotest/mybatisTest.csv")
    void mybatisTest(String name){
        //清除数据
        deleteStudentByName(name);
        //写数据
        Student stu =new Student();
        stu.setName(name);
        stu.setAge((short)18);
        insertStudent(stu);
        //查询数据
        print(findStudentByName(name));
    }
}
