package homework5.pro3;

public class PaypalStrategy implements PaymentStrategy{
    String email;

    public PaypalStrategy(String email){
        this.email=email;
    }
    @Override

    public void pay(int money) {
        System.out.println("Paypal "+ money);
    }
}
