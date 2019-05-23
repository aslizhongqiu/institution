package club.chenlinghong.institution.repository.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseDaoTest {

    @Autowired
    CourseDao courseDao;

    @Test
    public void getbyId(){
        System.out.println(courseDao.getById(520));
    }

}