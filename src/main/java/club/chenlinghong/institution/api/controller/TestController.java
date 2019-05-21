package club.chenlinghong.institution.api.controller;

import club.chenlinghong.institution.common.ResultUtil;
import club.chenlinghong.institution.common.ResultVo;
import club.chenlinghong.institution.enums.ErrorEnum;
import club.chenlinghong.institution.exception.InstitutionException;
import club.chenlinghong.institution.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 测试Controller
 * @Author chenlinghong
 * @Date 2019/5/21 20:47
 * @Version V1.0
 */
@Slf4j
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestService testService;

    /**
     * 获取所有记录
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
        return ResultUtil.success(testService.listAll(pageNo, pageSize));
    }
}
