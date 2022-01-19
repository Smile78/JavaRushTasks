package netology.hw322accnt.taxTypeS;

public class TaxService {
    public void payOut(double taxAmount) {
        System.out.format("Уплачен налог в размере %.2f руб. (поточнее:%.10f)%n", taxAmount, taxAmount);
    }
}
