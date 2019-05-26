package club.chenlinghong.institution.service.impl;

import club.chenlinghong.institution.common.PageDto;
import club.chenlinghong.institution.repository.dao.AdvanceDao;
import club.chenlinghong.institution.repository.domain.Advance;
import club.chenlinghong.institution.service.AdvanceService;
import lombok.extern.slf4j.Slf4j;
import org.aopalliance.aop.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/26 16:15
 * @Description:
 */

@Slf4j
@Service
public class AdvanceServiceImpl implements AdvanceService {

    @Autowired
    private AdvanceDao advanceDao;

    @Override
    public List<Advance> listByUserId(int userId) {
        return advanceDao.listByUserId(userId);
    }

    @Override
    public int insert(Advance advance) {
        return advanceDao.insert(advance);
    }

    @Override
    public int deleteById(int id) {
        return advanceDao.deleteById(id);
    }

    @Override
    public Advance getById(int id) {
        return advanceDao.getById(id);
    }

    @Override
    public PageDto<Advance> listAll(int pageNo, int pageSize) {
        List<Advance> domainList = advanceDao.listAll((pageNo - 1) * pageSize, pageSize);
        int totalCount = 0;
        if (domainList != null && domainList.size() > 0) {
            totalCount = advanceDao.count();
        }
        return new PageDto<>(domainList, pageNo, pageSize, totalCount);
    }

    @Override
    public int update(Advance advance) {
        return advanceDao.update(advance);
    }
}
