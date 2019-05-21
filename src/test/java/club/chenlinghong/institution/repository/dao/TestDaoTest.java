package club.chenlinghong.institution.repository.dao;

import club.chenlinghong.institution.repository.domain.TestDomain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDaoTest {

    @Autowired
    private TestDao testDao;


    @Test
    public void insert() {
        TestDomain domain = new TestDomain();
        domain.setName("test");
        int result = testDao.insert(domain);
        assertEquals(1, result);
    }

    @Test
    public void listAll() {
        List<TestDomain> domainList = testDao.listAll(0, 10);
        System.out.println(domainList);
    }

}