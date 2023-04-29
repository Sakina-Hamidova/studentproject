import java.util.List;

public interface StudentInterface {
    Student getById(byte id);
    void SaveStudent(Student student);
    List<Student> getAll();
}
