package curso.entities;

public class Student {
    private final String name;
    private final double noteOne;
    private final double noteTwo;
    private final double noteThree;

    public Student( String name, double noteOne, double noteTwo, double noteThree ) {
        this.name=name;
        this.noteOne=noteOne;
        this.noteTwo=noteTwo;
        this.noteThree=noteThree;
    }

    public double sum() {
        return this.noteOne+this.noteTwo+this.noteThree;
    }

    public boolean isAproved() {
        return sum()>=60;
    }

    public String finalGrade() {
        if ( isAproved() ) {
            return "\n"+this.name+" \nFINAL GRADE = "+sum()+"\nPASS";
        }
        return "\n"+this.name+" \nFINAL GRADE = "+ sum()+"\nFAILED"+"\nMISSING "+( 60-sum() )+" POINTS";
    }
}
