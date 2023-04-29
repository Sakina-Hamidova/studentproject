
public class Main {
    public static void main(String[] args) {
        StudentManager studentManager= new StudentManager();
        System.out.println(studentManager.getById((byte) 2));
        System.out.println(studentManager.getAll());
        studentManager.SaveStudent(new Student((byte) 5,"Tural", (byte) 27));
        System.out.println(studentManager.getById((byte) 5));


    }
}