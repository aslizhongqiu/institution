package club.chenlinghong.institution.service;

import club.chenlinghong.institution.common.PageDto;
import club.chenlinghong.institution.repository.domain.User;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/6/6 19:19
 * @Description:用户Service
 */
public interface UserService extends IBaseService<User> {

    /**
     * 获取所有老师
     * @param pageNo
     * @param pageSize
     * @return
     */
    PageDto<User> listTeacher(int pageNo, int pageSize);
}
