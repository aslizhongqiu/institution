package club.chenlinghong.institution.repository.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 用户类型
 * @Author chenlinghong
 * @Date 2019/5/22 20:05
 * @Version V1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserType extends BaseDomain {

    private static final long serialVersionUID = 207438013579173602L;

    /**
     * 类型名称
     */
    private String name;
}
