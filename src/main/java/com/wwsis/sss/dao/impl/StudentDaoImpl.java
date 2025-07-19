package com.wwsis.sss.dao.impl;

import com.wwsis.sss.dao.StudentDao;
import com.wwsis.sss.model.Student;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Student> getAllStudents() {
        String hql = "FROM Student";
        return entityManager.createQuery(hql, Student.class).getResultList();
    }

    @Override
    public Student getStudentById(Long id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public void saveStudent(Student student) {
        entityManager.persist(student);
    }

    @Override
    public void updateStudent(Student student) {
        entityManager.merge(student);
    }

    @Override
    public void deleteStudent(Long id) {
        Student student = getStudentById(id);
        if (student != null) {
            entityManager.remove(student);
        }
    }
}
