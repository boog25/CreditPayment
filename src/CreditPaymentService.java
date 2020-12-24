public class CreditPaymentService {
    public double calculate (int loanamount, int term){
        double rate = 9.99 / 100 / 12;
        double raschet = 1 + rate;
        double rashet = Math.pow(raschet, term);
        double annuitypayment = loanamount * ((rate * rashet)/(rashet - 1));
        double annui = Math.floor(annuitypayment);
        return annui;
    }
}
