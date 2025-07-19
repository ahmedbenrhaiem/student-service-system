package com.wwsis.sss.dao.impl;

import com.wwsis.sss.dao.TuitionDao;
import com.wwsis.sss.model.Tuition;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TuitionDaoImpl implements TuitionDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveTuition(Tuition tuition) {
        entityManager.persist(tuition);
    }

    @Override
    public List<Tuition> getAllTuitionPayments() {
        return entityManager.createQuery("FROM Tuition", Tuition.class).getResultList();
    }

    @Override
    public Tuition getTuitionById(Long id) {
        return entityManager.find(Tuition.class, id);
    }

    @Override
    public void updateTuition(Tuition tuition) {
        entityManager.merge(tuition);
    }

    @Override
    public void deleteTuition(Long id) {
        Tuition tuition = getTuitionById(id);
        if (tuition != null) {
            entityManager.remove(tuition);
        }
    }
}
