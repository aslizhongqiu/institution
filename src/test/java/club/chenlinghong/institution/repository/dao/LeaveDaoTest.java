package club.chenlinghong.institution.repository.dao;

import club.chenlinghong.institution.repository.domain.Leave;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeaveDaoTest {

    @Autowired
    private LeaveDao leaveDao;

    @Test
    public void insert(){
        Leave leave = new Leave();
        leave.setCourseId(520);
        leave.setUserId(520);
        leave.setReason("test");
        assertEquals(1,leaveDao.insert(leave));
    }

}