import java.util.ArrayList;
import java.util.List;

public class StudentManager implements StudentInterface{

    private static List<Student> students= new ArrayList<>();

    static {
        students.add(new Student((byte) 1,"Sakina", (byte) 28));
        students.add(new Student((byte) 2,"Madina", (byte) 26));
        students.add(new Student((byte) 3,"Gunay", (byte) 27));
        students.add(new Student((byte) 4,"Aytac", (byte) 27));
    }
    @Override
    public Student getById(byte id) {
        return students.get(id-1);
    }

    @Override
    public void SaveStudent(Student student) {
        students.add(student);

    }

    @Override
    public List<Student> getAll() {
        return students;
    }
}
