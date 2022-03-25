package estructural.Bridge.example.sin_patron.paymentgateway.bbva;

public class BBVAPaymentGatewayCash  extends BBVAPaymentGateway {

    public void makePayment(float amount) {
        super.processPayment(amount);
    }

}
