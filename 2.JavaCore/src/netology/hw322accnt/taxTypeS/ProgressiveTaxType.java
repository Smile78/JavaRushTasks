package netology.hw322accnt.taxTypeS;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {

    public String name = "Прогрессивный налог";

    public  String getNameT2() {
        return name;
    }

        public double calculateTaxFor(double amount) {
            //  TODO override me!
            //  Прогрессивный налог, до 100 тысяч = 10%, больше 100 тысяч = 15%

            return (amount<=100000)?amount*0.11:amount*0.15;
        }

    public double calculateTaxForDecimal(double amount) {

        BigDecimal taxa = new BigDecimal((amount<=100000)? "0.11": "0.15");
        BigDecimal amountIn= new BigDecimal(amount);
//        BigDecimal amountIn= new BigDecimal(Double.valueOf(amount));
        BigDecimal sum= taxa.multiply(amountIn);

        return sum.doubleValue();

    }

}
