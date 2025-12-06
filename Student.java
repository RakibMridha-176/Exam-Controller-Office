public class Student {

    private int id;
    private Mediator mediator;

    public Student(int id, Mediator m) {
        this.id = id;
        this.mediator = m;
    }

    public int getId() { 
        return id; 
    }

    public void receiveMark(int mark) {
        System.out.println("Student " + id + " received mark: " + mark);
    }

    public void requestReExamine() {
        System.out.println("\nre-examine request sent from student id " + id);
        mediator.handleReExamine(id);
    }
}
