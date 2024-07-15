import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepoTest {

    private StudentRepo studentRepo;

    @BeforeEach
    void setUp() {
        studentRepo = new StudentRepo();
    }

    @Test
    void testFindStudentById() {
        Student student = new Student("1", "John Doe","Maths");
        studentRepo.save(student);

        Student foundStudent = studentRepo.findStudentById("1");
        assertNotNull(foundStudent, "Student should be found");
        assertEquals("John Doe", foundStudent.name(), "Student name should match");

        Student notFoundStudent = studentRepo.findStudentById("2");
        assertNull(notFoundStudent, "Student with non-existing ID should return null");
    }

}