package com.autotest.base;

import dal.dao.student.StudentDAO;
import dal.model.student.StudentDO;
import dal.model.student.StudentDOExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@ContextConfiguration({"classpath:dal/dal-db.xml",
        "classpath:dal/dal-db-student.xml",
})
public class SpringTestBase extends AutoTestBase {

    @Autowired
    StudentDAO studentDAO;

    /**
     * 插入数据
     */
    protected void insertStudent(long id, String name, int age) {
        StudentDO studentDO = new StudentDO();
        studentDO.setId(id);
        studentDO.setName(name);
        studentDO.setAge(age);
        studentDAO.insert(studentDO);
    }

    /**
     * 查询数据
     */
    protected List<StudentDO> findStudentByName(String name) {
        StudentDOExample example = new StudentDOExample();
        example.createCriteria().andNameEqualTo(name);
        return studentDAO.selectByExample(example);
    }

    /**
     * 删除数据
     */
    protected void cleanStudentByName(String name) {
        StudentDOExample example = new StudentDOExample();
        example.createCriteria().andNameEqualTo(name);
        studentDAO.deleteByExample(example);
    }
}
