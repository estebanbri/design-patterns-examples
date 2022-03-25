package estructural.Bridge.example1.con_patron.gateway.impl;

import estructural.Bridge.example1.con_patron.gateway.PaymentGateway;

public class BBVAPaymentGateway implements PaymentGateway {

    @Override
    public void processPayment(String paymentType) {
        System.out.println("Processing payment with: " + paymentType + " with BBVA payment gateway");
    }

}
