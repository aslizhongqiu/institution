package club.chenlinghong.institution.service;

import club.chenlinghong.institution.api.vo.RecordVo;
import club.chenlinghong.institution.repository.domain.Settlement;

import java.util.List;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/27 10:13
 * @Description:
 */
public interface TeacherSettlementService extends IBaseService<Settlement> {

    /**
     * 老师课时费用结算
     *
     * @param userId
     * @return
     */
    List<RecordVo> SettlementTeacher(int userId);
}
