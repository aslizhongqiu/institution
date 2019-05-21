package club.chenlinghong.institution.api.handle;

import club.chenlinghong.institution.common.ResultUtil;
import club.chenlinghong.institution.common.ResultVo;
import club.chenlinghong.institution.exception.InstitutionException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description 全局异常处理器
 * @Author chenlinghong
 * @Date 2018/12/1 16:35
 **/
@Slf4j
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = InstitutionException.class)
    @ResponseBody
    public ResultVo handle(InstitutionException e) {
        log.error("ExceptionHandle#handle(BusinessException) : code={}, msg={}, e={}",
                e.getCode(), e.getMessage(), e);
        return ResultUtil.error(e);
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultVo handle(Exception e) {
        log.error("【系统异常】{}", e);
        return ResultUtil.error(1, "未知异常");
    }
}
