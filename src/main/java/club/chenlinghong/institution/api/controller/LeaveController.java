package club.chenlinghong.institution.api.controller;

import club.chenlinghong.institution.common.ResultUtil;
import club.chenlinghong.institution.common.ResultVo;
import club.chenlinghong.institution.enums.ErrorEnum;
import club.chenlinghong.institution.exception.InstitutionException;
import club.chenlinghong.institution.service.LeaveService;
import club.chenlinghong.institution.repository.domain.Leave;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/27 00:25
 * @Description:
 */

@Slf4j
@RestController
@RequestMapping("/leave")
public class LeaveController {

    @Autowired
    private LeaveService leaveService;

    @PostMapping(value = "/leave")
    public ResultVo insert(@Valid Leave leave, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("PresentController#insert: param is illegal. present=[{}].", leave);
            throw new InstitutionException(ErrorEnum.PARAM_ILLEGAL);
        }
        int result = leaveService.insert(leave);
        /**
         * 校驗結果
         */
        if (result != 1) {
            log.error("PresentController#insert: failed to insert. present=[{}]", leave);
            throw new InstitutionException(ErrorEnum.INSERT_ERROR);
        }
        return ResultUtil.success();
    }
}
