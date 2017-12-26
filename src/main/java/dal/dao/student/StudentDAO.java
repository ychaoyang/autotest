package dal.dao.student;

import com.autotest.annotation.MyMapper;
import dal.model.student.StudentDO;
import dal.model.student.StudentDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentDAO extends MyMapper<StudentDO> {
    long countByExample(StudentDOExample example);

    int deleteByExample(StudentDOExample example);

    List<StudentDO> selectByExample(StudentDOExample example);

    int updateByExampleSelective(@Param("record") StudentDO record, @Param("example") StudentDOExample example);

    int updateByExample(@Param("record") StudentDO record, @Param("example") StudentDOExample example);
}