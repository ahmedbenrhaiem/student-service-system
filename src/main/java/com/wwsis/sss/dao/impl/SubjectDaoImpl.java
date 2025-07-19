package com.wwsis.sss.dao.impl;

import com.wwsis.sss.dao.SubjectDao;
import com.wwsis.sss.model.Subject;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class SubjectDaoImpl implements SubjectDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Subject> getAllSubjects() {
        String hql = "FROM Subject";
        return entityManager.createQuery(hql, Subject.class).getResultList();
    }

    @Override
    public Subject getSubjectById(Long id) {
        return entityManager.find(Subject.class, id);
    }

    @Override
    public void saveSubject(Subject subject) {
        entityManager.persist(subject);
    }

    @Override
    public void updateSubject(Subject subject) {
        entityManager.merge(subject);
    }

    @Override
    public void deleteSubject(Long id) {
        Subject subject = getSubjectById(id);
        if (subject != null) {
            entityManager.remove(subject);
        }
    }
}
