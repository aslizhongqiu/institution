package club.chenlinghong.institution.service.impl;

import club.chenlinghong.institution.repository.dao.UserTypeDao;
import club.chenlinghong.institution.common.PageDto;
import club.chenlinghong.institution.repository.domain.UserType;
import club.chenlinghong.institution.service.UserTypeService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/6/8 22:20
 * @Description:
 */
@Service
public class UserTypeServiceImpl implements UserTypeService {

    @Autowired
    UserTypeDao userTypeDao;
    @Override
    public int insert(@NonNull UserType userType) {
        return 0;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }

    @Override
    public UserType getById(int id) {
        return userTypeDao.getById(id);
    }

    @Override
    public PageDto<UserType> listAll(int pageNo, int pageSize) {
        List<UserType> domainList =userTypeDao .listAll((pageNo - 1) * pageSize, pageSize);
        int totalCount = 0;
        if (domainList != null && domainList.size() > 0) {
            totalCount = userTypeDao.count();
        }
        return new PageDto<>(domainList, pageNo, pageSize, totalCount);
    }


    @Override
    public int update(@NonNull UserType userType) {
        return 0;
    }
}
