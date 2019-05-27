package club.chenlinghong.institution.repository.dao;

import club.chenlinghong.institution.repository.domain.Advance;
import club.chenlinghong.institution.repository.domain.Settlement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/27 09:43
 * @Description:
 */
public interface SettlementDao extends IBaseDao<Settlement> {


    /**
     * 根据用户id查询结算列表
     * @param userId 用户id
     * @return
     */
    List<Settlement> listByUserId(int userId);

    /**
     * 根据课程id查询结算
     * @param courseId
     * @return
     */
    List<Settlement> listByCourseId(int courseId);

    Settlement listUserCourse(@Param("userId") int userId, @Param("courseId") int courseId);
}
