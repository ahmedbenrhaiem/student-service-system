package com.wwsis.sss.dao;

import com.wwsis.sss.entity.Grade;
import java.util.List;

public interface GradeDao {
    List<Grade> getAllGrades();
    Grade getGradeById(Long id);
    void saveGrade(Grade grade);
    void updateGrade(Grade grade);
    void deleteGrade(Long id);
}
