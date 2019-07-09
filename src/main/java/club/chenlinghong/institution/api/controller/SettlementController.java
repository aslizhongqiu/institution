package club.chenlinghong.institution.api.controller;

import club.chenlinghong.institution.common.ResultUtil;
import club.chenlinghong.institution.common.ResultVo;
import club.chenlinghong.institution.enums.ErrorEnum;
import club.chenlinghong.institution.exception.InstitutionException;
import club.chenlinghong.institution.service.StudentSettlementService;
import club.chenlinghong.institution.service.TeacherSettlementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/27 12:22
 * @Description:课时结算Controller
 */
@Slf4j
@RestController
@RequestMapping("/settlement")
public class SettlementController {

    @Autowired
    private StudentSettlementService stuSettService;

    @Autowired
    private TeacherSettlementService teaSettlementService;

    /**
     * 根据用户id获取课程结算详情
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public ResultVo listSettlement(@PathVariable(value = "userId") int userId){
        if (userId==0){
            throw new InstitutionException(ErrorEnum.PARAM_IS_NULL);
        }
        return ResultUtil.success(stuSettService.SettlementStudent(userId));
    }

    /**
     * 根据老师id获取工资结算详情
     * @param userId
     * @return
     */
    @GetMapping("/teacher/{userId}")
    public ResultVo listTeacherSettlement(@PathVariable(value = "userId") int userId){
        if (userId==0){
            throw new InstitutionException(ErrorEnum.PARAM_IS_NULL);
        }
        return ResultUtil.success(teaSettlementService.SettlementTeacher(userId));
    }
}
