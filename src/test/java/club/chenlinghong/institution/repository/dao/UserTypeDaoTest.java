package club.chenlinghong.institution.repository.dao;

import club.chenlinghong.institution.repository.domain.UserType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTypeDaoTest {

    @Autowired
    private UserTypeDao typeDao;

    @Test
    public void insert() {
        UserType type = new UserType("test");
        int result = typeDao.insert(type);
        assertEquals(1, result);
    }

    @Test
    public void listAll() {
        List<UserType> typeList = typeDao.listAll(0, 10);
        System.out.println(typeList);
    }

}