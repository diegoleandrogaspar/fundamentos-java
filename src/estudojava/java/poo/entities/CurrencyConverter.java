package poo.entities;

public class CurrencyConverter {

    public double price;
    public double buy;

    public double conversion(double iof){
        return  (buy * price) * (1 + iof /100);
    }

    public String toString() {
        return String.format("Amount to be paid in reais = %.2f ", conversion(6));
    }

}
