package club.chenlinghong.institution.service;

import club.chenlinghong.institution.common.PageDto;
import club.chenlinghong.institution.repository.domain.Present;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/26 18:15
 * @Description:
 */
public interface PresentService extends IBaseService<Present> {

    /**
     * 获取考勤列表
     *
     * @param courseId
     * @return
     */
    PageDto listByCourse(int courseId);
}
