package club.chenlinghong.institution.service;

import club.chenlinghong.institution.repository.domain.Settlement;

import java.util.List;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/27 10:13
 * @Description:
 */
public interface StudentSettlementService extends IBaseService<Settlement> {

    List<Settlement> SettlementStudent(int userId);
}
