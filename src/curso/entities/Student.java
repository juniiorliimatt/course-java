package curso.entities;

public class Student {
    private String name;
    private String email;
    private double noteOne;
    private double noteTwo;
    private double noteThree;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Student(String name, double noteOne, double noteTwo, double noteThree) {
        this.name = name;
        this.noteOne = noteOne;
        this.noteTwo = noteTwo;
        this.noteThree = noteThree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double sum() {
        return this.noteOne + this.noteTwo + this.noteThree;
    }

    public boolean isAproved() {
        return sum() >= 60;
    }

    public String finalGrade() {
        if (isAproved()) {
            return "\n" + this.name + " \nFINAL GRADE = " + sum() + "\nPASS";
        }
        return "\n" + this.name + " \nFINAL GRADE = " + sum() + "\nFAILED" + "\nMISSING " + (60 - sum()) + " POINTS";
    }

    @Override
    public String toString() {
        return getName() + ", " + getEmail();
    }
}
