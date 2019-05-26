package club.chenlinghong.institution.service.impl;

import club.chenlinghong.institution.api.vo.PresentVO;
import club.chenlinghong.institution.common.PageDto;
import club.chenlinghong.institution.enums.ErrorEnum;
import club.chenlinghong.institution.exception.InstitutionException;
import club.chenlinghong.institution.repository.dao.PresentDao;
import club.chenlinghong.institution.repository.domain.Present;
import club.chenlinghong.institution.service.PresentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lizhongqiu
 * @Date: 2019/5/26 18:15
 * @Description:
 */
@Slf4j
@Service
public class PresentServiceImpl implements PresentService {

    @Autowired
    private PresentDao presentDao;

    @Override
    public int insert(Present present) {
        if (present == null){
            log.error("PresentService#insert: param is null.");
            throw new InstitutionException(ErrorEnum.PARAM_IS_NULL);
        }
        return presentDao.insert(present);
    }

    @Override
    public int deleteById(int id) {
        return presentDao.deleteById(id);
    }

    @Override
    public Present getById(int id) {
        return presentDao.getById(id);
    }

    @Override
    public PageDto<Present> listAll(int pageNo, int pageSize) {
        List<Present> presentList = presentDao.listAll((pageNo - 1)*pageSize, pageSize);
        int totalCount = presentDao.count();
        return new PageDto<>(presentList, pageNo,pageSize, totalCount);
    }

    @Override
    public int update(Present present) {

        if (present == null){
            log.error("PresentService#update: param is null.");
            throw new InstitutionException(ErrorEnum.PARAM_IS_NULL);
        }
        return presentDao.update(present);

    }

    @Override
    public List<PresentVO> listByUserId(int userId) {
        return presentDao.getByUserId(userId);
    }
}
