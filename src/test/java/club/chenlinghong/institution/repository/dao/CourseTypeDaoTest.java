package club.chenlinghong.institution.repository.dao;

import club.chenlinghong.institution.repository.domain.CourseType;
import club.chenlinghong.institution.repository.domain.UserType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseTypeDaoTest {

    @Autowired
    CourseTypeDao courseTypeDao;

    @Test
    public void insert() {
        CourseType courseType=new CourseType("生物");
        int result = courseTypeDao.insert(courseType);
        assertEquals(1, result);
    }

}