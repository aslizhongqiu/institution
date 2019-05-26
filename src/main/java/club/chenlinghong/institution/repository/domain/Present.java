package club.chenlinghong.institution.repository.domain;

import com.sun.xml.internal.ws.api.model.MEP;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/26 18:02
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Present extends BaseDomain {

    private static final long serialVersionUID = -4624571685372080858L;

    /**
     * 课程
     */
    @NotNull(message = "课程Id不能为空")
    private int courseId;

    private Course course;

    /**
     * 用户ID
     */
    @NotNull(message = "用户Id不能为空")
    private int userId;

    private User user;

    /**
     *
     */
    @NotNull(message = "考勤状态不能为空")
    private int attend;
}
