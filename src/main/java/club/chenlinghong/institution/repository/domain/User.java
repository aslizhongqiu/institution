package club.chenlinghong.institution.repository.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户类型Id
     */
    private int typeId;

    private UserType userType;
}
