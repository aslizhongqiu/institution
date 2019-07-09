package club.chenlinghong.institution.service.impl;

import club.chenlinghong.institution.exception.InstitutionException;
import club.chenlinghong.institution.repository.dao.LeaveDao;
import club.chenlinghong.institution.common.PageDto;
import club.chenlinghong.institution.enums.ErrorEnum;
import club.chenlinghong.institution.repository.domain.Leave;
import club.chenlinghong.institution.service.LeaveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/27 00:00
 * @Description:
 */

@Slf4j
@Service
public class LeaveServiceImpl implements LeaveService {

    @Autowired
    private LeaveDao leaveDao;
    @Override
    public int insert(Leave leave) {
        if(leave==null){
            throw new InstitutionException(ErrorEnum.PARAM_IS_NULL);
        }
        return leaveDao.insert(leave);
    }

    @Override
    public int deleteById(int id) {
        return leaveDao.deleteById(id);
    }

    @Override
    public Leave getById(int id) {
        return leaveDao.getById(id);
    }

    @Override
    public PageDto<Leave> listAll(int pageNo, int pageSize) {
        List<Leave> leaveList=leaveDao.listAll((pageNo-1)*pageSize,pageSize);
        int total=leaveDao.count();
        return new PageDto<>(leaveList,pageNo,pageSize,total);
    }

    @Override
    public int update(Leave leave) {
        if(leave==null){
            throw new InstitutionException(ErrorEnum.PARAM_IS_NULL);
        }
        return leaveDao.update(leave);
    }
}
