import java.util.*;

public class Main {
    public static void main(String[] args) {

        ExamController exam = new ExamController();
        Teacher teacher = new Teacher();

        exam.setTeacher(teacher);

        for (int i = 1; i <= 5; i++) {
            exam.addStudent(new Student(i, exam));
        }

        exam.sendInitialMarks();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter student ID (1-5) for re-examine: ");
        int id = sc.nextInt();

        exam.handleReExamine(id);
    }
}
