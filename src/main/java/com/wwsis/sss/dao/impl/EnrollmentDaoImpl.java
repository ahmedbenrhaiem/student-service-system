package com.wwsis.sss.dao.impl;

import com.wwsis.sss.dao.EnrollmentDao;
import com.wwsis.sss.model.Enrollment;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EnrollmentDaoImpl implements EnrollmentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveEnrollment(Enrollment enrollment) {
        entityManager.persist(enrollment);
    }

    @Override
    public List<Enrollment> getAllEnrollments() {
        return entityManager.createQuery("FROM Enrollment", Enrollment.class).getResultList();
    }

    @Override
    public Enrollment getEnrollmentById(Long id) {
        return entityManager.find(Enrollment.class, id);
    }

    @Override
    public void updateEnrollment(Enrollment enrollment) {
        entityManager.merge(enrollment);
    }

    @Override
    public void deleteEnrollment(Long id) {
        Enrollment enrollment = getEnrollmentById(id);
        if (enrollment != null) {
            entityManager.remove(enrollment);
        }
    }
}
