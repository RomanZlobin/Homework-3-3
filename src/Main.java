public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();
        double balanceOfTheLoan = 1_000_000.00; // остаток суммы кредита в рублях
        double interestRate = 9.99; // процентная ставка
        double term = 1; // срок кредита в годах
        double monthlyPayment = creditPaymentService.calculate(balanceOfTheLoan, interestRate,term);
        System.out.println("Ежемесячный платеж: " + monthlyPayment + " руб.");
    }
}