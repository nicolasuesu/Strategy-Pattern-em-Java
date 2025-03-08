package org.example;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static PaymentProcessor processor = new PaymentProcessor();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            try {
                mostrarMenu();
                int opcao = scanner.nextInt();
                scanner.nextLine(); // limpa o buffer

                if(opcao == 0) {
                    running = false;
                    continue;
                }

                if(opcao >= 1 && opcao <= 3) {
                    System.out.println("Digite o valor do pagamento:");
                    double valor = scanner.nextDouble();

                    if(valor <= 0) {
                        System.out.println("Valor inválido!");
                        continue;
                    }

                    processarPagamento(opcao, valor);
                } else {
                    System.out.println("Opção inválida!");
                }

            } catch(Exception e) {
                System.out.println("Erro: Entrada inválida!");
                scanner.nextLine();
            }
        }

        System.out.println("Programa encerrado!");
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=== Sistema de Pagamentos ===");
        System.out.println("1 - PIX");
        System.out.println("2 - Cartão de Crédito");
        System.out.println("3 - Boleto");
        System.out.println("0 - Sair");
        System.out.println("Escolha uma opção:");
    }

    private static void processarPagamento(int opcao, double valor) {
        switch(opcao) {
            case 1:
                processor.setPaymentStrategy(new PixPayment());
                break;
            case 2:
                processor.setPaymentStrategy(new CreditCardPayment());
                break;
            case 3:
                processor.setPaymentStrategy(new BoletoPayment());
                break;
        }
        processor.processPayment(valor);
    }
}