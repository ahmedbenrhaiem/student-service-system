package com.wwsis.sss.dao.impl;

import com.wwsis.sss.dao.LibraryDao;
import com.wwsis.sss.model.Library;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class LibraryDaoImpl implements LibraryDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveLibraryEntry(Library library) {
        entityManager.persist(library);
    }

    @Override
    public List<Library> getAllLibraryEntries() {
        return entityManager.createQuery("FROM Library", Library.class).getResultList();
    }

    @Override
    public Library getLibraryById(Long id) {
        return entityManager.find(Library.class, id);
    }

    @Override
    public void updateLibraryEntry(Library library) {
        entityManager.merge(library);
    }

    @Override
    public void deleteLibraryEntry(Long id) {
        Library library = getLibraryById(id);
        if (library != null) {
            entityManager.remove(library);
        }
    }
}
