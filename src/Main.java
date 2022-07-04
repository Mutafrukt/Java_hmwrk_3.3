public class Main {

    public static void main(String[] args) {

        double percent = 9.99;
        int sumOfCredit = 1000000;
        int term = 24;

        CreditPaymentService service = new CreditPaymentService();
        double finalSum = service.calculate(percent, sumOfCredit, term);

        System.out.println(finalSum);



    }
}
