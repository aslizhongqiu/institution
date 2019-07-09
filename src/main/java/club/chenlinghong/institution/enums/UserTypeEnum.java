package club.chenlinghong.institution.enums;

import lombok.Getter;

/**
 * 用户类型枚举类
 */
@Getter
public enum UserTypeEnum {

    TEACHER_TYPE(0,"老师类型id"),
    PARENTS_TYPE(1,"家长类型id"),
    NOR_STUDENT_TYPE(2,"普通学生类型id"),
    STAR_STUDENT_TYPE(3,"星标学生类型id"),
    ADMIN_TYPE(4,"管理员类型id");

    /**
     * 码
     */
    private Integer code;

    /**
     * 信息
     */
    private String msg;

    UserTypeEnum(int i, String 老师类型id) {
        this.code = code;
        this.msg = msg;
    }
}
