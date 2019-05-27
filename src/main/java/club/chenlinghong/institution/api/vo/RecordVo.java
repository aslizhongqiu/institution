package club.chenlinghong.institution.api.vo;

import club.chenlinghong.institution.repository.domain.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/27 00:14
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecordVo implements Serializable {

    private static final long serialVersionUID = -4486594991059444592L;

    private int courseId;

    private Course course;

    private int count;
}
