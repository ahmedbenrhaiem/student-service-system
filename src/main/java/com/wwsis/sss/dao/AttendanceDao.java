package com.wwsis.sss.dao;

import com.wwsis.sss.model.Attendance;
import java.util.List;

public interface AttendanceDao {
    void saveAttendance(Attendance attendance);
    List<Attendance> getAllAttendance();
    Attendance getAttendanceById(Long id);
    void updateAttendance(Attendance attendance);
    void deleteAttendance(Long id);
}
