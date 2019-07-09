package club.chenlinghong.institution.repository.dao;

import club.chenlinghong.institution.repository.domain.ClassType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassTypeDaoTest {

    @Autowired
    ClassTypeDao classTypeDao;

    @Test
    public void insert() {
        ClassType classType=new ClassType("精品班");
        int result = classTypeDao.insert(classType);
        assertEquals(1, result);
    }
}