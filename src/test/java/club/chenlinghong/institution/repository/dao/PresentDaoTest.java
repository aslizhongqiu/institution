package club.chenlinghong.institution.repository.dao;

import club.chenlinghong.institution.repository.domain.Present;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PresentDaoTest {

    @Autowired
    private PresentDao presentDao;

    @Test
    public void insert() {
        Present present = new Present();
        present.setCourseId(520);
        present.setUserId(520);
        present.setAttend(1);
        int result = presentDao.insert(present);
        assertEquals(1, result);
    }

    @Test
    public void listAll(){
        List<Present> presentList = presentDao.listAll(0,10);
        System.out.println(presentList);
    }

}