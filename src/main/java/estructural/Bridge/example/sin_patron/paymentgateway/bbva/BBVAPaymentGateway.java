package estructural.Bridge.example.sin_patron.paymentgateway.bbva;

import estructural.Bridge.example.sin_patron.paymentgateway.Payment;

public abstract class BBVAPaymentGateway  implements Payment {
    @Override
    public void processPayment(float amount) {
        System.out.println("Processing payment amount: " + amount + " with BBVA payment gateway");
    }
}