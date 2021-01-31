package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String discipline;

    public Teacher(String name, String discipline) {
        this.name = name;
        this.discipline = discipline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public void evaluate(Student x) {

        Random m = new Random();
        int q = m.nextInt(4) + 2;
        String s = null;
        if (q == 2) {
            s = "неудовлетворительно";
        }
        if (q == 3) {
            s = "удовлетворительно";
        }
        if (q == 4) {
            s = "хорошо";
        }
        if (q == 5) {
            s = "отлично";
        }
        System.out.println("Преподаватель " + this.name + " оценил студента " + x.getName()
                + " по предмету " + this.discipline + " на оценку " + s);

    }
}




