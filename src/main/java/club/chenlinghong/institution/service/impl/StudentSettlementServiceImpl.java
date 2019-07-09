package club.chenlinghong.institution.service.impl;

import club.chenlinghong.institution.exception.InstitutionException;
import club.chenlinghong.institution.repository.dao.PresentDao;
import club.chenlinghong.institution.repository.dao.SettlementDao;
import club.chenlinghong.institution.api.vo.RecordVo;
import club.chenlinghong.institution.common.PageDto;
import club.chenlinghong.institution.enums.ErrorEnum;
import club.chenlinghong.institution.repository.domain.Settlement;
import club.chenlinghong.institution.service.StudentSettlementService;
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
public class StudentSettlementServiceImpl implements StudentSettlementService {

    @Autowired
    private SettlementDao settlementDao;

    @Autowired
    private PresentDao presentDao;

    /**
     * 学生结算
     * @param userId
     * @return
     */
    @Override
    public List<Settlement> SettlementStudent(int userId) {
        List<RecordVo> recordVoList=presentDao.getByUserId(userId);
        List<Settlement> settlements=new ArrayList<Settlement>();
        for (RecordVo record:recordVoList
             ) {
            int courseId=record.getCourseId();
            if (settlementDao.listUserCourse(userId,courseId)==null){
                //封装结算信息
                Settlement settlement=new Settlement();
                settlement.setCourseId(courseId);
                settlement.setCourse(record.getCourse());
                settlement.setUserId(userId);
                int count=record.getCount();
                int price=record.getCourse().getPrice();
                settlement.setMoney(count*price);
                settlements.add(settlement);
            }
        }
        return settlements;
    }

    @Override
    public int insert(Settlement settlement) {
        if(settlement==null){
            throw new InstitutionException(ErrorEnum.PARAM_IS_NULL);
        }
        return settlementDao.insert(settlement);
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
