package entities;

public class BizStudent extends TechmasterStudent{
    private double marketingScore;
    private double saleScore;

    public BizStudent(String name, String major, double marketingScore, double saleScore) {
        super(name, major);
        this.marketingScore = marketingScore;
        this.saleScore = saleScore;
    }

    @Override
    public double getScore() {
        return (2*marketingScore + saleScore)/3;
    }

    @Override
    public String toString() {
        return "BizStudent{" +
                "marketingScore=" + marketingScore +
                ", saleScore=" + saleScore +
                '}';
    }
}
