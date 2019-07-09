package club.chenlinghong.institution.repository.dao;


import club.chenlinghong.institution.repository.domain.Advance;

import java.util.List;

public interface AdvanceDao extends IBaseDao<Advance> {

    /**
     * 根据学生id查询预交列表
     * @param userId 学生id
     * @return
     */
    List<Advance> listByUserId(int userId);

    /**
     * 根据课程id查询预交
     * @param courseId
     * @return
     */
    List<Advance> listByCourseId(int courseId);
}
