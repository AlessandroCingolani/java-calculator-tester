package ticket;

public class Ticket {

    // attributi
    private final double  PRICE_KM = 0.21;
    private final int UNDERAGE_DISCOUNT = 20, SENIOR_DISCOUNT = 40;

    private int age;
    private double km;


    // costruttori
    public Ticket(int age, double km) {
        if(age <= 0){
            throw new IllegalArgumentException("Age can't be negative or zero");
        }
        if(km <= 0){
            throw new IllegalArgumentException("Km can't be negative or zero");
        }
        this.age = age;
        this.km = km;
    }

    public int getAge() {
        return age;
    }

    public double getKm() {
        return km;
    }

    // metodi
    public double getPriceTicket(){
        double priceTicket = PRICE_KM * km;
        if(age < 18) {
            priceTicket = priceTicket - (priceTicket*((double) UNDERAGE_DISCOUNT / 100));
        } else if (age > 65) {
            priceTicket = priceTicket - (priceTicket*((double) SENIOR_DISCOUNT / 100));
        }
        return priceTicket;
    }


}
