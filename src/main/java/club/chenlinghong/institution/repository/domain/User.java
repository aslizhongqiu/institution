package club.chenlinghong.institution.repository.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @Description 用户信息
 * @Author chenlinghong
 * @Date 2019/5/22 20:06
 * @Version V1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseDomain {

    private static final long serialVersionUID = -7711815989392660105L;

    /**
     * 名称
     */
    @NotNull(message = "用户名不能为空")
    private String name;

    /**
     * 密码
     */
    @NotNull(message = "密码不能为空")
    private String password;

    /**
     * 用户类型Id
     */
    @NotNull(message = "用户类型不能为空")
    private int typeId;

    private UserType userType;
}
