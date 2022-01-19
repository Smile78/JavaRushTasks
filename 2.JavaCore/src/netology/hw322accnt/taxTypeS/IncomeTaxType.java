package netology.hw322accnt.taxTypeS;

import java.math.BigDecimal;


public class IncomeTaxType extends TaxType {

    public String name = "Подоходный налог";

    public String getNameT2() {
        return name;
    }

    public double calculateTaxFor(double amount) {
        // TODO override me!
        // Подоходный налог, = 13%
        return amount * 0.13;
    }

    public double calculateTaxForDecimal(double amount) {
        BigDecimal taxa = new BigDecimal("0.13");
        BigDecimal amountIn = new BigDecimal(amount);
//        BigDecimal amountIn= new BigDecimal(Double.valueOf(amount));
        BigDecimal sum = taxa.multiply(amountIn);
        return sum.doubleValue();
    }
}
