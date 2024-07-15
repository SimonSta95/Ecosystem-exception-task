import java.util.*;

public class StudentRepo {

    private final Map<String, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        students.put(student.id(), student);
        return student;
    }

    public Student findStudentById(String id) {
        try{
            return students.get(id);
        }catch(NullPointerException e){
            System.out.println("Student not found" + e.getMessage());
            return null;
        }

    }
}
