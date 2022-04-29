public class CreditPaymentService {
    public double calculate(double balanceOfTheLoan, double interestRate, double term) {
        double monthlyInterestRate = interestRate / (100 * 12);
        double periodsBeforeExpiration = term * 12;
        double monthlyPayment = balanceOfTheLoan * (monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, 0 - periodsBeforeExpiration)));

        return monthlyPayment;
    }
}