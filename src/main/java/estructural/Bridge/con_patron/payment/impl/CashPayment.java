package estructural.Bridge.con_patron.payment.impl;

import estructural.Bridge.con_patron.gateway.PaymentGateway;
import estructural.Bridge.con_patron.payment.Payment;

public class CashPayment extends Payment {

    public CashPayment(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
    public void makePayment() {
        this.paymentGateway.processPayment("Cash");
    }
}
