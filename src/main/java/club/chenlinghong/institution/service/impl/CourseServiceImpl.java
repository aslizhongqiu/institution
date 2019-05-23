package club.chenlinghong.institution.service.impl;

import club.chenlinghong.institution.common.PageDto;
import club.chenlinghong.institution.repository.dao.CourseDao;
import club.chenlinghong.institution.repository.domain.Course;
import club.chenlinghong.institution.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/22 22:41
 * @Description:
 */
@Slf4j
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseDao courseDao;

    @Override
    public int insert(Course course) {
        return courseDao.insert(course);
    }

    @Override
    public int deleteById(long id) {
        return courseDao.deleteById(id);
    }

    @Override
    public Course getById(long id) {
        return courseDao.getById(id);
    }

    @Override
    public PageDto<Course> listAll(long pageNo, long pageSize) {
        //TODO
        return null;
    }

    @Override
    public int update(Course course) {
        return courseDao.update(course);
    }
}
