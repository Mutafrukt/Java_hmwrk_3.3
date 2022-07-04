public class CreditPaymentService {

    public double calculate(double percM, int sum, int term) {

        double annPay;
        annPay = sum * (percM + (percM / (1 + percM) * term - 1));
        return annPay;


    }
}
