package club.chenlinghong.institution.repository.dao;

import club.chenlinghong.institution.repository.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void insert() {
        User user = new User();
        user.setName("李中秋");
        user.setPassword("123456");
        user.setTypeId(520);
        int result = userDao.insert(user);
        assertEquals(1, result);
    }

    @Test
    public void listAll() {
        List<User> userList = userDao.listAll(0, 10);
        System.out.println(userList);
    }

}