package homework5.pro3;

public class CreditCardStrategy implements PaymentStrategy{
    String cardNumber;
    public CreditCardStrategy(String cardNumber){
        this.cardNumber=cardNumber;
    }
    @Override
    public void pay(int money) {
        System.out.println("CreditCard "+ money);
    }
}
