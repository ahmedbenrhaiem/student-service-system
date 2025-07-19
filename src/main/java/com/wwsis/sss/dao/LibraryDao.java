package com.wwsis.sss.dao;

import com.wwsis.sss.model.Library;
import java.util.List;

public interface LibraryDao {
    void saveLibraryEntry(Library library);
    List<Library> getAllLibraryEntries();
    Library getLibraryById(Long id);
    void updateLibraryEntry(Library library);
    void deleteLibraryEntry(Long id);
}
