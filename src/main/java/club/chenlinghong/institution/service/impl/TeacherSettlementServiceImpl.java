package club.chenlinghong.institution.service.impl;

import club.chenlinghong.institution.api.vo.PresentVo;
import club.chenlinghong.institution.api.vo.RecordVo;
import club.chenlinghong.institution.common.PageDto;
import club.chenlinghong.institution.enums.ErrorEnum;
import club.chenlinghong.institution.exception.InstitutionException;
import club.chenlinghong.institution.repository.dao.CourseDao;
import club.chenlinghong.institution.repository.dao.PresentDao;
import club.chenlinghong.institution.repository.dao.SettlementDao;
import club.chenlinghong.institution.repository.domain.Course;
import club.chenlinghong.institution.repository.domain.Present;
import club.chenlinghong.institution.repository.domain.Settlement;
import club.chenlinghong.institution.service.StudentSettlementService;
import club.chenlinghong.institution.service.TeacherSettlementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/27 10:15
 * @Description:
 */
@Slf4j
@Service
public class TeacherSettlementServiceImpl implements TeacherSettlementService {

    @Autowired
    CourseDao courseDao;

    @Autowired
    PresentDao presentDao;


    @Override
    public List<RecordVo> SettlementTeacher(int userId) {
        //获取老师上课的所有课程
        List<Course> courses=courseDao.getByTeacherId(userId);
        //考勤记录表
        List<RecordVo> recordVo=new ArrayList<RecordVo>();
        int count=0;
        if(courses!=null){
            for (Course course:courses
                 ) {
                List<Present> presents=presentDao.listAllPresent(course.getId());
                if(presents!=null){
                    count=presents.size();
                    recordVo.add(new RecordVo(course.getId(),course,count));
                }
            }
        }
        return recordVo;
    }

    @Override
    public int insert(Settlement settlement) {
        return 0;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }

    @Override
    public Settlement getById(int id) {
        return null;
    }

    @Override
    public PageDto<Settlement> listAll(int pageNo, int pageSize) {
        return null;
    }

    @Override
    public int update(Settlement settlement) {
        return 0;
    }
}
