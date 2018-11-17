/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vezba4;

/**
 *
 * @author marko
 */
import java.util.ArrayList;
import java.util.List;

public class StockPriceGenerator {

    private List<String> podrzaniSimboli = new ArrayList<>();

    public StockPriceGenerator() {
        podrzaniSimboli.add("AAPL");
        podrzaniSimboli.add("MSFT");
        podrzaniSimboli.add("YHOO");
        podrzaniSimboli.add("AMZN");
        podrzaniSimboli.add("IBM");
    }

    public double getCena(String simbol) throws Exception {

        // Check if the symbol is invalid 
        if (podrzaniSimboli.indexOf(simbol.toUpperCase()) == -1) {
            throw new Exception("Simbol nije korektan. Koristite neke od ovih: "
                    + getPodrzaniSimboli());
        }

        return new Double(Math.random() * 100);
    }

    private String getPodrzaniSimboli() {
        StringBuilder simboli = new StringBuilder();
        for (String symbolName : podrzaniSimboli) {
            simboli.append(symbolName);
            simboli.append(" ");
        }
        return simboli.toString();
    }
}

