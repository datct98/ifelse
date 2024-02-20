package entities;

public abstract class TechmasterStudent {
    private String name;
    private String major;

    public TechmasterStudent(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public abstract double getScore();

    public String classify(){
        if(getScore()< 5){
            return "D";
        } else if (getScore()>= 5 && getScore()<6.5)
            return "C";
        else if(getScore()>=6.5 && getScore() <7.5)
            return "B";
        else return "A";
    }

    public void printInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Major: "+ major);
        System.out.println("Score: "+ getScore());
        System.out.println("Rank: "+ classify());
    }

    @Override
    public String toString() {
        return "TechmasterStudent{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
