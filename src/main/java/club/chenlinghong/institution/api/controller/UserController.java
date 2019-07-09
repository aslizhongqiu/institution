package club.chenlinghong.institution.api.controller;

import club.chenlinghong.institution.common.ResultUtil;
import club.chenlinghong.institution.common.ResultVo;
import club.chenlinghong.institution.enums.ErrorEnum;
import club.chenlinghong.institution.enums.UserTypeEnum;
import club.chenlinghong.institution.exception.InstitutionException;
import club.chenlinghong.institution.service.UserService;
import club.chenlinghong.institution.service.UserTypeService;
import club.chenlinghong.institution.repository.domain.User;
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
    @GetMapping(value = "type/all")
    public ResultVo typeistAll(@RequestParam(value = "pageNo", required = false, defaultValue = "1") int pageNo,
                            @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize) {
        if (pageNo < 0 || pageSize < 0) {
            log.error("TestController#listAll: param is illegal. pageNo={}, pageSize={}.", pageNo, pageSize);
            throw new InstitutionException(ErrorEnum.PARAM_ILLEGAL);
        }
        return ResultUtil.success(userTypeService.listAll(pageNo, pageSize));
    }

    /**
     * 分页获取所有用户
     * @param pageNo
     * @param pageSize
     * @return
     */
    @GetMapping(value = "all")
    public ResultVo listAll(@RequestParam(value = "pageNo", required = false, defaultValue = "1") int pageNo,
                            @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize) {
        if (pageNo < 1|| pageSize < 0) {
            throw new InstitutionException(ErrorEnum.PARAM_ILLEGAL);
        }
        return ResultUtil.success(userService.listAll(pageNo, pageSize));
    }

    @GetMapping(value = "teacher")
    public ResultVo listTeacher(@RequestParam(value = "pageNo", required = false, defaultValue = "1") int pageNo,
                            @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize) {
        if (pageNo < 1|| pageSize < 0) {
            throw new InstitutionException(ErrorEnum.PARAM_ILLEGAL);
        }
        return ResultUtil.success(userService.listTeacher(pageNo, pageSize));
    }

    /**
     * 根据用户id修改用户类型
     * @param id 用户id
     * @param typeId 用户类型
     * @return
     */
    @PostMapping(value = "type")
    public ResultVo modifyType(@RequestParam(value = "id") int id,
                               @RequestParam(value = "typeId")int typeId){
        if(id==0||typeId==0){
            throw new InstitutionException(ErrorEnum.PARAM_IS_NULL);
        }
        if (userTypeService.getById(typeId)==null){
            throw new InstitutionException(ErrorEnum.PARAM_ILLEGAL);
        }
        User user=userService.getById(id);
        if (user==null){
            throw new InstitutionException(ErrorEnum.NO_USER);
        }
        else {
            int type=user.getTypeId();
            if(type==522||type==523){
                user.setTypeId(typeId);
                userService.updateType(id,typeId);
            }
            else{
                throw new InstitutionException(ErrorEnum.PARAM_ILLEGAL);
            }

        }
        return ResultUtil.success();
    }

}
