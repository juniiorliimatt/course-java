package curso.entities;

public class Rent {
    private int room;
    private Student student;

    public Rent(int room, Student student) {
        this.room = room;
        this.student = student;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return getRoom() + ": " + student;
    }
}
