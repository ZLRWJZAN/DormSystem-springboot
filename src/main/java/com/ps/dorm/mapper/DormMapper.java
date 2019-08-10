package com.ps.dorm.mapper;

import com.ps.dorm.domain.DormDo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/15 11:18
 */
@Repository
public interface DormMapper {
    void dormInsert(DormDo dormDo);
    void dormUpdate(DormDo dormDo);
    void dormDelete(DormDo dormDo);
    List<DormDo> dormSelect();
    List<DormDo> dormSelectPeople();
}
