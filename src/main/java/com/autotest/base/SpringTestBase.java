package com.autotest.base;

import dal.dao.student.StudentDAO;
import dal.model.student.StudentDO;
import dal.model.student.StudentDOExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;


/**
 * Created by ychaoyang on 2017/7/24.
 */
@ContextConfiguration({
        "/dal/dal-db-student.xml",
        "/dal/dal-db.xml",
})
public class SpringTestBase extends AutoTestBase {

    @Autowired
    protected StudentDAO studentDAO;


    protected List<StudentDO> findStudentByName(String name) {
        StudentDOExample ex = new StudentDOExample();
        ex.createCriteria().andNameEqualTo(name);
        return studentDAO.selectByExample(ex);
    }


    protected void insertStudent(String name, short age) {
        StudentDO stu = new StudentDO();
        stu.setName(name);
        stu.setAge(age);
        studentDAO.insert(stu);
    }


    protected void deleteStudentByName(String name) {
        if(null == name || name.isEmpty()){
            name = "name";
        }
        StudentDOExample ex = new StudentDOExample();
        ex.createCriteria().andNameEqualTo(name);
        studentDAO.deleteByExample(ex);
    }

}
