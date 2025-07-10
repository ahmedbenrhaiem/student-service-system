package com.wwsis.sss.dao;

import com.wwsis.sss.entity.Subject;
import java.util.List;

public interface SubjectDao {
    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
    void saveSubject(Subject subject);
    void updateSubject(Subject subject);
    void deleteSubject(Long id);
}
