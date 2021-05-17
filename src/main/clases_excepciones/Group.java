package uaslp.objetos.exams;

import java.util.List;

public class Group {
    private int i;
    private int capacity;
    private Student estudiante;
    private int aviable;
    private double average;
    private Object[] array;

    public Group(int i) {
        this.i=i;
    }

    public List<Student> getStudents() {
        return estudiante.getName();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailability() {
        return aviable;
    }

    public void addStudent(Student estudiante) throws GroupIsFullException {
        //throw new GroupIsFullException();
        if()
    }

    public double getAverage() {
        return average;
    }
}
