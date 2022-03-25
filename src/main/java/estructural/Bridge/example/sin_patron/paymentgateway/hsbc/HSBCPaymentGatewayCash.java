package estructural.Bridge.example.sin_patron.paymentgateway.hsbc;


import estructural.Bridge.example.sin_patron.paymentgateway.Payment;

public class HSBCPaymentGatewayCash extends HSBCPaymentGateway {
    public void makePayment(float amount) {
        super.processPayment(amount);
    }
}
