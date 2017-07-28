package com.autotest.base;

import dal.dao.StudentMapper;
import dal.model.Student;
import dal.model.StudentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

/**
 * Created by ychaoyang on 2017/7/24.
 */
@ContextConfiguration({
//        "/integration/dubbo.xml",
//        "/integration/integration.xml",
        "/dal/dal-db-test.xml",
        "/dal/dal-db.xml",
})
public class SpringTestBase extends AutoTestBase {

    @Autowired
    protected StudentMapper studentMapper;

    /**
     * 查询student表数据
     * @param name 姓名
     * @return
     */
    protected List<Student> findStudentByName(String name) {
        StudentExample ex = new StudentExample();
        ex.createCriteria().andNameEqualTo(name);
        return studentMapper.selectByExample(ex);
    }

    /**
     * 插入student表数据
     * @param name 姓名
     * @param age 年龄
     */
    protected void insertStudent(String name, short age) {
        Student stu = new Student();
        stu.setName(name);
        stu.setAge(age);
        studentMapper.insert(stu);
    }

    /**
     * 删除student表数据
     * @param name 姓名
     */
    protected void deleteStudentByName(String name) {
        if(null == name || name.isEmpty()){
            name = "name";
        }
        StudentExample ex = new StudentExample();
        ex.createCriteria().andNameEqualTo(name);
        studentMapper.deleteByExample(ex);
    }

}
