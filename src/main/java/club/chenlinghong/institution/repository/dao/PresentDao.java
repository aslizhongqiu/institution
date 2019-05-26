package club.chenlinghong.institution.repository.dao;

import club.chenlinghong.institution.api.vo.PresentVo;
import club.chenlinghong.institution.repository.domain.Present;

import java.util.List;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/26 18:04
 * @Description:
 */
public interface PresentDao extends IBaseDao<Present> {


    List<PresentVo> listByCourse(int courseId);
}
