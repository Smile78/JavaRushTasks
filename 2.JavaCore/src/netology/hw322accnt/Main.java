package netology.hw322accnt;

import netology.hw322accnt.taxTypeS.*;

public class Main {


    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                // TODO создать платежи с различным типами налогообложения
                new Bill(1546505464.50, new TaxType(), taxService),
                new Bill(154650.50, new IncomeTaxType(), taxService),
                new Bill(3556780.20, new VATaxType(), taxService),
                new Bill(24586504.40, new ProgressiveTaxType(), taxService)
        };


        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }


    }
}
