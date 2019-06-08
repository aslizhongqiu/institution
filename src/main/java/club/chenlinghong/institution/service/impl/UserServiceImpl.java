package club.chenlinghong.institution.service.impl;

import club.chenlinghong.institution.common.PageDto;
import club.chenlinghong.institution.enums.ErrorEnum;
import club.chenlinghong.institution.exception.InstitutionException;
import club.chenlinghong.institution.repository.dao.UserDao;
import club.chenlinghong.institution.repository.domain.User;
import club.chenlinghong.institution.service.UserService;
import club.chenlinghong.institution.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/6/6 19:21
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    UserTypeService userTypeService;

    @Override
    public int insert(User user) {
        int userTypeId=user.getTypeId();
        if (userTypeService.getById(userTypeId)==null){
            throw new InstitutionException(ErrorEnum.PARAM_ILLEGAL);
        }
        return userDao.insert(user);
    }

    @Override
    public int deleteById(int id) {
        return userDao.deleteById(id);
    }

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    public PageDto<User> listAll(int pageNo, int pageSize) {
        return null;
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }
}
