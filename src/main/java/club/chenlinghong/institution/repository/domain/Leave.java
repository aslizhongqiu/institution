package club.chenlinghong.institution.repository.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/26 23:53
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Leave extends BaseDomain{

    private static final long serialVersionUID = 1524022500568350105L;

    /**
     * 关联课程ID
     */
    @NotNull(message = "课程id不能为空")
    private int courseId;

    /**
     * 关联课程
     */
    private Course course;

    /**
     * 请假用户ID
     */
    @NotNull(message = "请假人的id不能为空")
    private int userId;

    /**
     * 请假用户
     */
    private User user;

    /**
     *请假原因
     */
    private String reason;
}
