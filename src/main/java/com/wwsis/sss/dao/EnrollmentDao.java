package com.wwsis.sss.dao;

import com.wwsis.sss.model.Enrollment;
import java.util.List;

public interface EnrollmentDao {
    void saveEnrollment(Enrollment enrollment);
    List<Enrollment> getAllEnrollments();
    Enrollment getEnrollmentById(Long id);
    void updateEnrollment(Enrollment enrollment);
    void deleteEnrollment(Long id);
}
