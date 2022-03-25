package estructural.Bridge.example.sin_patron.paymentgateway.hsbc;

import estructural.Bridge.example.sin_patron.paymentgateway.Payment;

public abstract class HSBCPaymentGateway implements Payment {
    @Override
    public void processPayment(float amount) {
        System.out.println("Processing payment with: " + amount + " with HSBC payment gateway");
    }
}
