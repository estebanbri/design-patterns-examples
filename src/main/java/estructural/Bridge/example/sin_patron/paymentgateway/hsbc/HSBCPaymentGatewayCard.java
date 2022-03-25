package estructural.Bridge.example.sin_patron.paymentgateway.hsbc;

public class HSBCPaymentGatewayCard extends HSBCPaymentGateway {

    public void makePayment(float amount) {
        float total = amount + 50F; // 50$ Impuesto  // FIXME Codigo Duplicado en todas los tipos Card
        super.processPayment(total);
    }
}
