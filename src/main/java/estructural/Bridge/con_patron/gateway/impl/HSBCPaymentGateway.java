package estructural.Bridge.con_patron.gateway.impl;

import estructural.Bridge.con_patron.gateway.PaymentGateway;

public class HSBCPaymentGateway implements PaymentGateway {

    @Override
    public void processPayment(String paymentType) {
        System.out.println("Processing payment with: " + paymentType + " with HSBC payment gateway");
    }

}
