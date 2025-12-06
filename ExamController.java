import java.util.*;

public class ExamController implements Mediator {

    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList<>();
    private Map<Integer, Integer> marks = new HashMap<>();
    private Random random = new Random();

    public void setTeacher(Teacher t) { this.teacher = t; }

    public void addStudent(Student s) { students.add(s); }

    @Override
    public void sendInitialMarks() {

        System.out.println("scripts and marks of student id 1,2,3,4,5 sent to exam controller office");

        // initial sample marks
        marks.put(1, 78);
        marks.put(2, 85);
        marks.put(3, 67);
        marks.put(4, 91);
        marks.put(5, 73);

        System.out.println("\n--- Marks received ---");
        marks.forEach((id, mark) -> System.out.println("Student " + id + ": " + mark));

        boolean mistakeOccurred = false;

        // Scrutinize
        for (int id : marks.keySet()) {
            if (random.nextDouble() < 0.55) { 
                int old = marks.get(id);
                int corrected = old + (random.nextInt(5) - 2);

                if (corrected != old) {
                    System.out.println("\n[Mistake Found] Student " + id +
                            " previous: " + old + " corrected: " + corrected);
                    marks.put(id, corrected);
                    mistakeOccurred = true;
                }
            }
        }

        if (!mistakeOccurred) {
            int old = marks.get(1);
            System.out.println("\n[Forced Correction] Student 1 previous: " + old + " corrected: " + (old + 2));
            marks.put(1, old + 2);
        }

        System.out.println("\n--- Published Results ---");
        for (Student s : students) {
            s.receiveMark(marks.get(s.getId()));
        }
    }

    @Override
    public void handleReExamine(int studentId) {

        System.out.println("re-examine request got from student id " + studentId);

        int oldMark = marks.get(studentId);
        int newMark = teacher.reCheck(studentId, oldMark);

        if (newMark != oldMark) {
            System.out.println("Re-exam change: " + oldMark + " -> " + newMark);
            marks.put(studentId, newMark);
        } else {
            System.out.println("No change after re-examine.");
        }

        students.get(studentId - 1).receiveMark(marks.get(studentId));
    }
}
