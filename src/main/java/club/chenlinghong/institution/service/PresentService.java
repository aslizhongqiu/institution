package club.chenlinghong.institution.service;

import club.chenlinghong.institution.api.vo.PresentVO;
import club.chenlinghong.institution.repository.domain.Present;

import java.util.List;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/26 18:15
 * @Description:
 */
public interface PresentService extends IBaseService<Present> {

    /**
     * 根据用户id获取考勤详情
     * @param userId
     * @return
     */
    List<PresentVO> listByUserId(int userId);
}
