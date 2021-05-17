package uaslp.objetos.exams;

public class Student {
    private String nombre;
    private int id;
    private int score;
    private int score2;
    private double suma=0;
    private double promedio=0;

    public Student(String nombre, int id) {
        this.nombre=nombre;
        this.id=id;
    }

    public String getName() {
        return nombre;
    }

    public int getCode() {
        return id;
    }

    public void setScore(int score, int score2) {
        this.score=score;
        this.score2=score2;
    }

    public double getAverage() {
        suma=suma+score2;
        promedio=suma/score;
        return promedio;
    }
}
