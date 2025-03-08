package org.example;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void processPayment(double amount) {
        if(paymentStrategy == null) {
            System.out.println("Erro: Método de pagamento não selecionado!");
            return;
        }
        paymentStrategy.processPayment(amount);
    }
}