package club.chenlinghong.institution.repository.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/23 17:41
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Advance extends BaseDomain{

    private static final long serialVersionUID = 8369559285414469224L;
    /**
     * 关联课程ID
     */
    private int courseId;

    /**
     * 关联课程
     */
    private Course course;

    /**
     * 预交用户ID
     */
    private int userId;

    /**
     * 预交用户
     */
    private User user;

    /**
     * 预交金额
     */
    private int money;

    /**
     * 预交发票号
     */
    private String number;
}
