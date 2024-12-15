public class CreditPaymentService {
    public int calculate(int amount, double percentPerYear, int term) {
        double percentPerMonth = percentPerYear / 100 / 12;
        double paymentPerMonth = amount * (percentPerMonth + percentPerMonth / (Math.pow(1 + percentPerMonth, term) - 1));
        return (int) paymentPerMonth;
    }
}
