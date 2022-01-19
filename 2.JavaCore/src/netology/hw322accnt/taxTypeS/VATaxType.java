package netology.hw322accnt.taxTypeS;

import java.math.BigDecimal;

public class VATaxType extends TaxType {


    public String name = "НДС";

    public  String getNameT2() {
        return name;
    }


    public double calculateTaxFor(double amount) {
        // TODO override me!
        //        НДС, = 18%

        return amount * 0.18;
    }

    public double calculateTaxForDecimal(double amount) {

        BigDecimal taxa = new BigDecimal("0.18");
        BigDecimal amountIn = new BigDecimal(amount);
//        BigDecimal amountIn= new BigDecimal(Double.valueOf(amount));
        BigDecimal sum = taxa.multiply(amountIn);
        return sum.doubleValue();

    }

}
