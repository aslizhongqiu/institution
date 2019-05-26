package club.chenlinghong.institution.service.impl;

import club.chenlinghong.institution.common.PageDto;
import club.chenlinghong.institution.repository.dao.CourseDao;
import club.chenlinghong.institution.repository.domain.Course;
import club.chenlinghong.institution.repository.domain.User;
import club.chenlinghong.institution.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/22 22:41
 * @Description:
 */
@Slf4j
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public int insert(Course course) {
        return courseDao.insert(course);
    }

    @Override
    public int deleteById(int id) {
        return courseDao.deleteById(id);
    }

    @Override
    public Course getById(int id) {
        return courseDao.getById(id);
    }

    @Override
    public PageDto<Course> listAll(int pageNo, int pageSize) {
        //TODO
        return null;
    }

    @Override
    public int update(Course course) {
        return courseDao.update(course);
    }

    @Override
    public PageDto<Course> getByTeacherId(int userId) {
        List<Course> courseList=courseDao.getByTeacherId(userId);
        int total=courseDao.teacherTotal(userId);
        return new PageDto<>(courseList,1,10,total);
    }
}
