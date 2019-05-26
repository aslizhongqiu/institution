package club.chenlinghong.institution.service;

import club.chenlinghong.institution.repository.domain.Advance;
import org.aopalliance.aop.Advice;

import java.util.List;

public interface AdvanceService extends IBaseService<Advance>{

    /**
     * 根据用户id获取预交列表
     * @param userId
     * @return
     */
    List<Advance> listByUserId(int userId);
}
