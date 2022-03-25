package estructural.Bridge.example1.con_patron.payment;

import estructural.Bridge.example1.con_patron.gateway.PaymentGateway;

public abstract class Payment {

    protected PaymentGateway paymentGateway; // Composition (Payment uses a PaymentGateway)

    protected Payment(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public abstract void makePayment();
}
