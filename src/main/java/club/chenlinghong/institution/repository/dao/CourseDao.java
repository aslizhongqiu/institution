package club.chenlinghong.institution.repository.dao;

import club.chenlinghong.institution.repository.domain.Course;

import java.util.List;

public interface CourseDao extends IBaseDao<Course> {

    /**
     * 根据老师id获取其授课课程
     * @param userId
     * @return
     */
    List<Course> getByTeacherId(int userId);

    /**
     * 根据老师id获取其授课课程总数
     * @param userId
     * @return
     */
    int teacherTotal(int userId);



}
