package com.autotest;

import com.autotest.annotation.AutoTest;
import com.autotest.base.SpringTestBase;

public class MybatisTest extends SpringTestBase {

    @AutoTest(file = "mybatisTest.csv")
    void mybatisTest(int testId, long id, String name, int age) {
        //插入数据
        insertStudent(id, name, age);
        //查询数据
        print(findStudentByName(name));
        //清除数据
        cleanStudentByName(name);
    }
}
