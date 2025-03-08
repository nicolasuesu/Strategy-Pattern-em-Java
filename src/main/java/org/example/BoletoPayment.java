package org.example;

import java.util.Random;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Random random = new Random();
        String boletoCode = String.format("%011d", random.nextInt(100000000));

        System.out.println("=== Pagamento Boleto ===");
        System.out.println("Valor: R$" + amount);
        System.out.println("Código: " + boletoCode);
        System.out.println("Status: Boleto gerado!");
    }
}