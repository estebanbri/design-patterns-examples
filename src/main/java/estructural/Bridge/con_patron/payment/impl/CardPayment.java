package estructural.Bridge.con_patron.payment.impl;

import estructural.Bridge.con_patron.gateway.PaymentGateway;
import estructural.Bridge.con_patron.payment.Payment;

public class CardPayment extends Payment {

    public CardPayment(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
    public void makePayment() {
        this.paymentGateway.processPayment("Card");
    }
}
