package com.wwsis.sss.dao.impl;

import com.wwsis.sss.dao.AttendanceDao;
import com.wwsis.sss.model.Attendance;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AttendanceDaoImpl implements AttendanceDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveAttendance(Attendance attendance) {
        entityManager.persist(attendance);
    }

    @Override
    public List<Attendance> getAllAttendance() {
        return entityManager.createQuery("FROM Attendance", Attendance.class).getResultList();
    }

    @Override
    public Attendance getAttendanceById(Long id) {
        return entityManager.find(Attendance.class, id);
    }

    @Override
    public void updateAttendance(Attendance attendance) {
        entityManager.merge(attendance);
    }

    @Override
    public void deleteAttendance(Long id) {
        Attendance attendance = getAttendanceById(id);
        if (attendance != null) {
            entityManager.remove(attendance);
        }
    }
}
