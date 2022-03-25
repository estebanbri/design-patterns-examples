package estructural.Bridge.example.con_patron.gateway.impl;

import estructural.Bridge.example.con_patron.gateway.PaymentGateway;

public class HSBCPaymentGateway implements PaymentGateway {

    @Override
    public void processPayment(float amount) {
        System.out.println("Processing payment with: " + amount + " with HSBC payment gateway");
    }

}
