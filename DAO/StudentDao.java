package DAO;

import java.util.List;

/**
 * Description: StudentDao
 * Author: silence
 * Update: silence(2016-08-03 21:03)
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
