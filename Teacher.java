import java.util.Random;

public class Teacher {

    private Random random = new Random();

    public int reCheck(int studentId, int oldMark) {
        System.out.println("Teacher re-checking student " + studentId);
        return oldMark + (random.nextInt(5) - 2);
    }
}
