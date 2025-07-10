package com.wwsis.sss.dao.impl;

import com.wwsis.sss.dao.GradeDao;
import com.wwsis.sss.entity.Grade;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class GradeDaoImpl implements GradeDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Grade> getAllGrades() {
        String hql = "FROM Grade";
        return entityManager.createQuery(hql, Grade.class).getResultList();
    }

    @Override
    public Grade getGradeById(Long id) {
        return entityManager.find(Grade.class, id);
    }

    @Override
    public void saveGrade(Grade grade) {
        entityManager.persist(grade);
    }

    @Override
    public void updateGrade(Grade grade) {
        entityManager.merge(grade);
    }

    @Override
    public void deleteGrade(Long id) {
        Grade grade = getGradeById(id);
        if (grade != null) {
            entityManager.remove(grade);
        }
    }
}
