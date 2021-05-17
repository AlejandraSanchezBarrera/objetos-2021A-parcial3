package clases_excepciones;

public class Student {
    private String nombre;
    private int id;
    private int score[];
    private double avarage;

    public Student(String nombre, int id) {
        this.nombre=nombre;
        this.id=id;
        avarage=0;
        score=new int[4];
    }

    public String getName() {
        return nombre;
    }

    public int getCode() {
        return id;
    }

    public void setScore(int parcial, int score2) throws InvalidPartialException {
        if(parcial>3)
        {
            throw new InvalidPartialException();
        }else{
            score[parcial]=score2;
        }
    }

    public double getAverage() throws MissingScoreException{
        int suma=0;

        for(int i=1;i<4;i++){
            if (score[i]==i+1){
                suma+=score[i];
            }else
            {
                throw new MissingScoreException();
            }
        }
        avarage=suma/ 3;
        return avarage;
    }
}
