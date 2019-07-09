package club.chenlinghong.institution.repository.dao;

import club.chenlinghong.institution.repository.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description 用户
 * @Author lizhongqiu
 * @Date 2019/5/22 20:08
 * @Version V1.0
 */
public interface UserDao extends IBaseDao<User> {

    /**
     * 分页获取所有的老师信息
     * @param offset
     * @param rows
     * @return
     */
    List<User> listTeacher(@Param("offset") int offset, @Param("rows") int rows);

    /**
     * 获取老师总数
     * @return
     */
    int countTeacher();

}
