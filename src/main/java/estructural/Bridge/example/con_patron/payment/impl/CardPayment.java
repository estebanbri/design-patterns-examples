package estructural.Bridge.example.con_patron.payment.impl;

import estructural.Bridge.example.con_patron.gateway.PaymentGateway;
import estructural.Bridge.example.con_patron.payment.Payment;

public class CardPayment extends Payment {

    public CardPayment(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
    public void makePayment(float amount) {
        float total = amount + 50F; // Impuesto
        this.paymentGateway.processPayment(total);
    }
}
