public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double OneYears = service.calculate(1000000,12);
        System.out.println(OneYears);

        double TwoYears = service.calculate(1000000,24);
        System.out.println(TwoYears);

        double ThreeYears = service.calculate(1000000,36);
        System.out.println(ThreeYears);

    }
}
