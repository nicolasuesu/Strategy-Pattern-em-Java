package org.example;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void processPayment(double amount) {
        System.out.println("=== Pagamento Cartão de Crédito ===");
        System.out.println("Digite o número do cartão:");
        String cardNumber = scanner.nextLine();

        if(cardNumber.length() != 16) {
            System.out.println("Número de cartão inválido!");
            return;
        }

        System.out.println("Valor: R$" + amount);
        System.out.println("Cartão: **** **** **** " + cardNumber.substring(12));
        System.out.println("Status: Aprovado!");
    }
}