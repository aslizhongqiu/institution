package club.chenlinghong.institution.api.controller;

import club.chenlinghong.institution.common.ResultUtil;
import club.chenlinghong.institution.common.ResultVo;
import club.chenlinghong.institution.enums.ErrorEnum;
import club.chenlinghong.institution.exception.InstitutionException;
import club.chenlinghong.institution.repository.domain.Present;
import club.chenlinghong.institution.repository.domain.User;
import club.chenlinghong.institution.service.UserService;
import club.chenlinghong.institution.service.UserTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/6/6 19:23
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserTypeService userTypeService;

    @PostMapping(value = "/user")
    public ResultVo insert(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("PresentController#insert: param is illegal. user=[{}].", user);
            throw new InstitutionException(ErrorEnum.PARAM_ILLEGAL);
        }
        userService.insert(user);
        return ResultUtil.success();
    }

    /**
     * 获取所有用户类型记录
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    @GetMapping(value = "/all")
    public ResultVo listAll(@RequestParam(value = "pageNo", required = false, defaultValue = "1") int pageNo,
                            @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize) {
        if (pageNo < 0 || pageSize < 0) {
            log.error("TestController#listAll: param is illegal. pageNo={}, pageSize={}.", pageNo, pageSize);
            throw new InstitutionException(ErrorEnum.PARAM_ILLEGAL);
        }
        return ResultUtil.success(userTypeService.listAll(pageNo, pageSize));
    }

}
