package com.autotest;

import com.autotest.annotation.AutoTest;
import com.autotest.base.SpringTestBase;
import dal.model.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by ychaoyang on 2017/7/27.
 */
public class MybatisTest extends SpringTestBase{

    @AutoTest(file= "autotest/mybatisTest.csv")
    void mybatisTest(String name,short age){
        //清除数据
        deleteStudentByName(name);
        //写数据
        insertStudent(name, age);
        //查询数据
        print(findStudentByName(name));
        //断言
        assertEquals(age,findStudentByName(name).get(0).getAge().shortValue());
    }


}
