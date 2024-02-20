package entities;

public class ItStudent extends TechmasterStudent{
    private double javaScore;
    private double htmlSCore;
    private double cssScore;

    public ItStudent(String name, String major) {
        super(name, major);
    }

    public ItStudent(String name, String major, double javaScore, double htmlSCore, double cssScore) {
        super(name, major);
        this.javaScore = javaScore;
        this.htmlSCore = htmlSCore;
        this.cssScore = cssScore;
    }

    @Override
    public double getScore() {
        return (2*javaScore + htmlSCore + cssScore)/ 4;
    }


    @Override
    public String toString() {
        return "ItStudent{" +
                "javaScore=" + javaScore +
                ", htmlSCore=" + htmlSCore +
                ", cssScore=" + cssScore +
                '}';
    }
}
