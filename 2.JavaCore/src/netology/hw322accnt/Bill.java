package netology.hw322accnt;


import netology.hw322accnt.taxTypeS.*;

class Bill {
    private double amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        // TODO вместо 0.0 посчитать размер налога исходя из TaxType
//        double taxAmount = 0.0;
        double taxAmount = taxType.calculateTaxFor(amount);
        System.out.println("Тип налогообложения: " + taxType.getNameT2());
        System.out.printf("Сумма налогообложения: %.2f \n" ,  amount);
        System.out.print("расчет по double: ");
        taxService.payOut(taxAmount);
        System.out.print("расчет по BD:     ");
        taxAmount = taxType.calculateTaxForDecimal(amount);
        taxService.payOut(taxAmount);
        System.out.println("");
    }



}
