package poo.entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;


    public double grade(){
       return grade1 + grade2 + grade3;
    }

    public double finishGrade() {
        if (grade() < 60.0) {
            return 60.0 - grade();
        }
        else {
            return 0.0;
        }
    }

}
