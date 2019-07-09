package club.chenlinghong.institution.api.controller;

import club.chenlinghong.institution.common.ResultUtil;
import club.chenlinghong.institution.common.ResultVo;
import club.chenlinghong.institution.enums.ErrorEnum;
import club.chenlinghong.institution.exception.InstitutionException;
import club.chenlinghong.institution.service.AdvanceService;
import club.chenlinghong.institution.repository.domain.Advance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/26 16:32
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping(value = "/advance")
public class AdvanceController {

    @Autowired
    private AdvanceService advanceService;

    /**
     * 添加预交信息
     * @param courseId
     * @param userId
     * @param money
     * @param number
     * @return
     */
    @PostMapping("/advance")
    public ResultVo add(@RequestParam(value = "courseId") int courseId,
                        @RequestParam(value = "userId") int userId,
                        @RequestParam(value = "money") int money,
                        @RequestParam(value = "number") String number){
        if (courseId==0||userId==0||money==0|| StringUtils.isEmpty(number)) {
            throw new InstitutionException(ErrorEnum.PARAM_IS_NULL);
        }
        Advance advance=new Advance();
        advance.setCourseId(courseId);
        advance.setUserId(userId);
        advance.setMoney(money);
        advance.setNumber(number);
        advanceService.insert(advance);
        return ResultUtil.success();
    }

    /**
     * 根据学生id获取所有的预交信息
     * @param userId
     * @return
     */
    @GetMapping("/userid")
    public ResultVo getByUserId(@RequestParam(value = "userId") int userId){
        if (userId==0){
            throw new InstitutionException(ErrorEnum.PARAM_IS_NULL);
        }
        return ResultUtil.success(advanceService.listByUserId(userId));
    }
}
