package club.chenlinghong.institution.repository.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TODO
 * @Author chenlinghong
 * @Date 2019/5/21 20:25
 * @Version V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestDomain extends BaseDomain {

    private static final long serialVersionUID = 4074210152594642141L;

    /**
     * 名称
     */
    private String name;

}
