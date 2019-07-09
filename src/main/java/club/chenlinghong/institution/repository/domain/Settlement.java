package club.chenlinghong.institution.repository.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/27 09:39
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Settlement  extends BaseDomain {

    private static final long serialVersionUID = -7857588835443474722L;

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
     * 结算ID
     */
    @NotNull(message = "结算人的id不能为空")
    private int userId;

    /**
     * 用户
     */
    private User user;

    /**
     * 结算金额
     */
    private int money;

}
