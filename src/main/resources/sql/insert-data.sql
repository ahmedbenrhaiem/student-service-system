-- USERS (formerly students)
INSERT INTO users (username, email, password_hash) VALUES
('jdoe', 'john.doe@example.com', '$2a$10$U2ZmZWtGZWtU/5VqpseEEeXMdMBV8FjMRjG/qN63hXZGbk/jgb8mi'), -- password: 123456
('jsmith', 'jane.smith@example.com', '$2a$10$U2ZmZWtGZWtU/5VqpseEEeXMdMBV8FjMRjG/qN63hXZGbk/jgb8mi'),
('ajohnson', 'alice.johnson@example.com', '$2a$10$U2ZmZWtGZWtU/5VqpseEEeXMdMBV8FjMRjG/qN63hXZGbk/jgb8mi');

-- SUBJECTS
INSERT INTO subjects (name, description, lecturer, day_of_week, time_slot) VALUES
('Mathematics', 'Basic math course', 'Dr. Brown', 'Monday', '08:00'),
('Physics', 'Introduction to physics', 'Dr. Green', 'Wednesday', '10:00'),
('History', 'World history overview', 'Dr. White', 'Friday', '14:00');

-- GRADES
-- assuming IDs 1, 2, 3 for users and 1, 2, 3 for subjects
INSERT INTO grades (user_id, subject_id, grade, grade_date, teacher) VALUES
(1, 1, 'A', '2024-05-01', 'Dr. Brown'),
(1, 2, 'B', '2024-05-02', 'Dr. Green'),
(2, 3, 'C', '2024-05-03', 'Dr. White'),
(2, 1, 'A', '2024-05-04', 'Dr. Brown'),
(3, 2, 'B', '2024-05-05', 'Dr. Green');

-- ENROLLMENTS
INSERT INTO enrollments (user_id, subject_id) VALUES
(1, 1), (1, 2), (2, 2), (2, 3), (3, 1);

-- TUITION
INSERT INTO tuition (user_id, payment_date, amount, description) VALUES
(1, '2024-03-01', 1200.00, 'Spring semester payment'),
(2, '2024-03-05', 1150.00, 'Spring semester payment'),
(3, '2024-03-10', 1300.00, 'Spring semester payment');

-- LIBRARY
INSERT INTO library (user_id, book_title, type, status, date) VALUES
(1, 'Clean Code', 'borrow', 'done', '2024-04-01'),
(2, 'Spring in Action', 'booking', 'pending', '2024-04-03'),
(3, 'Effective Java', 'borrow', 'overdue', '2024-03-25');
