package com.ps.dorm.mapper;

import com.ps.dorm.domain.StudentDo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/15 11:18
 */
@Repository
public interface StuMapper {
    void stuInsert(StudentDo studentDo);
    void stuUpdate(StudentDo studentDo);
    void stuDelete(StudentDo studentDo);
    List<StudentDo> stuSelect();
    List<StudentDo> stuSelectDetail();
    List<StudentDo> stuLoveCount();
    List<StudentDo> stuLimit();
}
