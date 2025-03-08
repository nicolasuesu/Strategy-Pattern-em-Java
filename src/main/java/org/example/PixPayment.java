package org.example;

import java.util.Random;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Random random = new Random();
        String pixCode = String.format("%010d", random.nextInt(1000000000));

        System.out.println("=== Pagamento PIX ===");
        System.out.println("Valor: R$" + amount);
        System.out.println("Código PIX: " + pixCode);
        System.out.println("Status: Processado!");
    }
}