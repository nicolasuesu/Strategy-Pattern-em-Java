# Strategy Pattern in Java

## Project Description

This project implements a simple payment system using the **Strategy** design pattern. The objective is to allow the user to dynamically select a payment method and process a fictitious transaction without modifying existing code when new payment methods are added.

## Features

- **PIX:**  
  Generates a random code to simulate a PIX payment.

- **Credit Card:**  
  Prompts the user for a credit card number, performs basic validation (ensuring the card number has 16 digits), and simulates the payment transaction.

- **Boleto:**  
  Generates a fictitious code to simulate the issuance of a boleto.

## Code Structure

- **PaymentStrategy:**  
  An interface that defines the method `processPayment(double amount)`, which is implemented by each payment method class.

- **PixPayment, CreditCardPayment, BoletoPayment:**  
  Classes that implement the `PaymentStrategy` interface, each representing a different payment method.

- **PaymentProcessor:**  
  A class that receives and executes the selected payment strategy.

- **Main:**  
  The main class that displays an interactive terminal menu, allowing the user to select a payment method and enter the transaction amount.

## How to Run

### Prerequisites

- **Java Development Kit (JDK):** Version 8 or higher.
- **Terminal or IDE:** For compiling and executing the code.

### Compilation and Execution

1. **Compile the Code**

   Navigate to the directory containing the `Main.java` file and run:

   ```bash
   javac Main.java
   ```

2. **Run the Program**

   After successful compilation, run the program with:

   ```bash
   java Main
   ```

3. **Usage**

   When the program starts, the following menu will be displayed:

   ```
   === Payment System ===
   1 - PIX
   2 - Credit Card
   3 - Boleto
   0 - Exit
   Please choose an option:
   ```

    - Choose an option (1, 2, or 3) to select the desired payment method.
    - Enter the transaction amount when prompted.
    - The system will process the payment using the selected strategy and display the corresponding information.

## Considerations

- **Strategy Pattern:**  
  By using the Strategy pattern, new payment methods can be added easily by implementing the `PaymentStrategy` interface, without changing the existing codebase.

- **Validations:**
    - The credit card payment method includes a basic validation to check if the card number contains exactly 16 digits.
    - There is also a validation to ensure that the transaction amount is greater than zero.

- **Extensibility:**  
  Additional payment strategies can be integrated by creating new classes that implement `PaymentStrategy` and updating the menu options if necessary.

## Conclusion

This exercise demonstrates the application of the Strategy pattern to develop a modular and flexible payment system. The separation of payment strategies facilitates maintenance and scalability, promoting a clean and organized code architecture.

---