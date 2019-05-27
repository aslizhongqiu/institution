package club.chenlinghong.institution.service;


import club.chenlinghong.institution.api.vo.PresentVo;
import club.chenlinghong.institution.api.vo.RecordVo;
import club.chenlinghong.institution.common.PageDto;



import club.chenlinghong.institution.repository.domain.Present;

import java.util.List;

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

     /* 根据用户id获取考勤详情
     * @param userId
     * @return
     */
    List<RecordVo> listByUserId(int userId);

}
