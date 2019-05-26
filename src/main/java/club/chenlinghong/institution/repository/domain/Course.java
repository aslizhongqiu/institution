package club.chenlinghong.institution.repository.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/22 21:31
 * @Description:课程
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course extends BaseDomain {

    private static final long serialVersionUID = 8737044684878791107L;

    /**
     * 课程类型Id
     */
    private int courseTypeId;

    /**
     * 课程分类
     */
    private CourseType courseType;

    /**
     * 班级类型Id
     */
    private int classTypeId;

    /**
     * 班级分类
     */
    private ClassType classType;

    /**
     * 用户Id
     */
    private int userId;

    /**
     * 教师信息
     */
    private User  user;

    /**
     * 上课时间
     */
    private String time;

    /**
     * 上课地址
     */
    private String address;

    /**
     * 每课时单价
     */
    private int price;

    /**
     * 课程容量
     */
    private int number;
}
