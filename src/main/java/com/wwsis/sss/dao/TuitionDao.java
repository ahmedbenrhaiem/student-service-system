package com.wwsis.sss.dao;

import com.wwsis.sss.model.Tuition;
import java.util.List;

public interface TuitionDao {
    void saveTuition(Tuition tuition);
    List<Tuition> getAllTuitionPayments();
    Tuition getTuitionById(Long id);
    void updateTuition(Tuition tuition);
    void deleteTuition(Long id);
}
