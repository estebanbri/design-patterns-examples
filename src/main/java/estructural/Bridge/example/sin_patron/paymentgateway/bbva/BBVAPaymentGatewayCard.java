package estructural.Bridge.example.sin_patron.paymentgateway.bbva;

public class BBVAPaymentGatewayCard extends BBVAPaymentGateway {

    public void makePayment(float amount) {
        float total = amount + 50F;   // 50$ Impuesto  // FIXME Codigo Duplicado en todas los tipos Card
        super.processPayment(total);
    }
}
