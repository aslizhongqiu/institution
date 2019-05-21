package club.chenlinghong.institution.exception;

import club.chenlinghong.institution.enums.ErrorEnum;
import lombok.Getter;

/**
 * @Description 自定义业务异常
 * @Author chenlinghong
 * @Date 2019/5/21 20:40
 * @Version V1.0
 */
@Getter
public class InstitutionException extends RuntimeException {

    /**
     * 异常码
     */
    private Integer code;

    public InstitutionException(String message, Throwable cause) {
        super(message, cause);
        this.code = ErrorEnum.UNKNOWN_ERROR.getCode();
    }

    public InstitutionException(ErrorEnum errorEnum) {
        super(errorEnum.getMsg());
        this.code = errorEnum.getCode();
    }

    public InstitutionException(int code, String message) {
        super(message);
        this.code = code;
    }


}
