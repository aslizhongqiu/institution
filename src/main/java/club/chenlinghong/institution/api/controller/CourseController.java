package club.chenlinghong.institution.api.controller;

import club.chenlinghong.institution.common.ResultUtil;
import club.chenlinghong.institution.common.ResultVo;
import club.chenlinghong.institution.enums.ErrorEnum;
import club.chenlinghong.institution.exception.InstitutionException;
import club.chenlinghong.institution.repository.domain.Course;
import club.chenlinghong.institution.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/23 10:25
 * @Description:课程的controller
 */
@Slf4j
@RestController
@RequestMapping(value = "/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    /**
     * 根据课程id获取课程详情
     * @param id
     * @return
     */
    @GetMapping("/course/{id}")
    public ResultVo geCourseById(@PathVariable(value = "id") int id){
        return ResultUtil.success(courseService.getById(id));
    }

    /**
     * 添加课程
     * @param courseTypeId 课程类型id
     * @param classTypeId 班级类型id
     * @param userId 授课老师id
     * @param time 上课时间
     * @param address 地址
     * @param price 价格
     * @param number 容量
     * @return
     */
    @PostMapping("/course")
    public ResultVo addCourse(@RequestParam(value = "courseTypeId") int courseTypeId,
                              @RequestParam(value = "classTypeId") int classTypeId,
                              @RequestParam(value = "userId") int userId,
                              @RequestParam(value = "time", required = false) String time,
                              @RequestParam(value = "address", required = false) String address,
                              @RequestParam(value = "price") int price,
                              @RequestParam(value = "number") int number){
        Course course=new Course();
        if (courseTypeId==0||classTypeId==0||userId==0||price==0||number==0){
            throw new InstitutionException(ErrorEnum.PARAM_IS_NULL);
        }
        course.setCourseTypeId(courseTypeId);
        course.setClassTypeId(classTypeId);
        course.setUserId(userId);
        course.setTime(time);
        course.setAddress(address);
        course.setPrice(price);
        course.setNumber(number);
        courseService.insert(course);
        return ResultUtil.success();
    }

}
