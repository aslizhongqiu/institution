package club.chenlinghong.institution.repository.dao;

import club.chenlinghong.institution.api.vo.PresentVO;
import club.chenlinghong.institution.repository.domain.Present;

import java.util.List;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/26 18:04
 * @Description:
 */
public interface PresentDao extends IBaseDao<Present> {

    /**
     * 根据学生id获取考勤里的课程信息列表
     * @param userId
     * @return
     */
    List<PresentVO> getByUserId(int userId);
}
