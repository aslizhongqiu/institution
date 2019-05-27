package club.chenlinghong.institution.api.vo;

import club.chenlinghong.institution.repository.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author chenlinghong
 * @Date 2019/5/26 22:45
 * @Version V1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PresentVo implements Serializable {

    private static final long serialVersionUID = -1398252479547674902L;

    private int userId;

    private User user;

}
