package club.chenlinghong.institution.service.impl;

import club.chenlinghong.institution.repository.dao.TestDao;
import club.chenlinghong.institution.common.PageDto;
import club.chenlinghong.institution.repository.domain.TestDomain;
import club.chenlinghong.institution.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author chenlinghong
 * @Date 2019/5/21 20:30
 * @Version V1.0
 */
@Slf4j
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public int insert(TestDomain testDomain) {
        return 0;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }

    @Override
    public TestDomain getById(int id) {
        return null;
    }

    @Override
    public PageDto<TestDomain> listAll(int pageNo, int pageSize) {
        List<TestDomain> domainList = testDao.listAll((pageNo - 1) * pageSize, pageSize);
        int totalCount = 0;
        if (domainList != null && domainList.size() > 0) {
            totalCount = testDao.count();
        }
        return new PageDto<>(domainList, pageNo, pageSize, totalCount);
    }

    @Override
    public int update(TestDomain testDomain) {
        return 0;
    }
}
