package estructural.Bridge.con_patron.payment;

import estructural.Bridge.con_patron.gateway.PaymentGateway;

public abstract class Payment {

    protected PaymentGateway paymentGateway;

    protected Payment(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public abstract void makePayment();
}
