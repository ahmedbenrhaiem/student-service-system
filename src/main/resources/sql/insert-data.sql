-- Insert test data into students table
INSERT INTO students (first_name, last_name, email) VALUES ('John', 'Doe', 'john.doe@example.com');
INSERT INTO students (first_name, last_name, email) VALUES ('Jane', 'Smith', 'jane.smith@example.com');
INSERT INTO students (first_name, last_name, email) VALUES ('Alice', 'Johnson', 'alice.johnson@example.com');

-- Insert test data into subjects table
INSERT INTO subjects (name, description, lecturer) VALUES ('Mathematics', 'Basic math course', 'Dr. Brown');
INSERT INTO subjects (name, description, lecturer) VALUES ('Physics', 'Introduction to physics', 'Dr. Green');
INSERT INTO subjects (name, description, lecturer) VALUES ('History', 'World history overview', 'Dr. White');

-- Insert test data into grades table
-- Assuming student and subject IDs start from 1
INSERT INTO grades (student_id, subject_id, grade_value, grade_date) VALUES (15, 9, 'A', '2024-05-01');
INSERT INTO grades (student_id, subject_id, grade_value, grade_date) VALUES (15, 10, 'B', '2024-05-02');
INSERT INTO grades (student_id, subject_id, grade_value, grade_date) VALUES (16, 11, 'C', '2024-05-03');
INSERT INTO grades (student_id, subject_id, grade_value, grade_date) VALUES (16, 9, 'A', '2024-05-04');
INSERT INTO grades (student_id, subject_id, grade_value, grade_date) VALUES (17, 10, 'B', '2024-05-05'); 