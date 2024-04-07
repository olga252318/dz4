import java.util.List;

//принцип разделения интерфейсов

public class StudentController implements UserController<Student> {

    private final StudentGroupSetvice studentGroupSetvice = new StudentGroupSetvice();

    private final StudentView studentView = new StudentView();

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupSetvice.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList(){
        List<Student> studentList = studentGroupSetvice.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFIO(){
        List<Student> studentList = studentGroupSetvice.getSortedStudentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public void create(String firstName, String lastName, String middleName){
        studentGroupSetvice.createStudent(firstName, lastName, middleName);
    }

}