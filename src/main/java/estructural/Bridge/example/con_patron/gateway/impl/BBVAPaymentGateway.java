package estructural.Bridge.example.con_patron.gateway.impl;

import estructural.Bridge.example.con_patron.gateway.PaymentGateway;

public class BBVAPaymentGateway implements PaymentGateway {

    @Override
    public void processPayment(float amount) {
        System.out.println("Processing payment amount: " + amount + " with BBVA payment gateway");
    }

}
