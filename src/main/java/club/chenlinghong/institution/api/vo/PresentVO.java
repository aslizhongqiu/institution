package club.chenlinghong.institution.api.vo;

import club.chenlinghong.institution.repository.domain.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/26 22:21
 * @Description:考勤类的页面对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PresentVO  implements Serializable {

    private static final long serialVersionUID = -3808068968143392839L;

    /**
     * 课程id
     */
    private int courseId;

    /**
     * 课程详情
     */
    private Course course;

    /**
     * 考勤次数
     */
    private int count;
}
