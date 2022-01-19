package netology.hw322accnt.taxTypeS;

public class TaxType {

    public String name = "Особая экономическая зона";

    public String getNameT2() {
        return name;
    }

    public double calculateTaxFor(double amount) {
        // TODO override me!
        System.out.println("Подфортило : сосед - директор налоговой");
        return amount * 0;
    }

    public double calculateTaxForDecimal(double amount) {
        return 0;
    }
}