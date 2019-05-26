package club.chenlinghong.institution.api.controller;

import club.chenlinghong.institution.common.ResultUtil;
import club.chenlinghong.institution.common.ResultVo;
import club.chenlinghong.institution.enums.ErrorEnum;
import club.chenlinghong.institution.exception.InstitutionException;
import club.chenlinghong.institution.repository.domain.Present;
import club.chenlinghong.institution.service.PresentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/26 18:20
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/present")
public class PresentController {

    @Autowired
    private PresentService presentService;

    @PostMapping(value = "/present")
    public ResultVo insert(@Valid Present present, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            log.error("PresentController#insert: param is illegal. present=[{}].", present);
            throw new InstitutionException(ErrorEnum.PARAM_ILLEGAL);
        }
        int result = presentService.insert(present);
        /**
         * 校驗結果
         */
        if(result != 1){
            log.error("PresentController#insert: failed to insert. present=[{}]", present);
            throw new InstitutionException(ErrorEnum.INSERT_ERROR);
        }
        return ResultUtil.success();
    }
}