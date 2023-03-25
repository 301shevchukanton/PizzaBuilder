/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabuilderdemo;

import java.math.BigDecimal;

/**
 *
 * @author antonshevchuk
 */
public class StrategySample {
    public static class EasterDiscounter implements Discounter {
        @Override
        public BigDecimal applyDiscount(BigDecimal amount) {
            return amount.multiply(BigDecimal.valueOf(0.5));
        }
    }

    public static class ChristmasDiscounter implements Discounter {
       @Override
       public BigDecimal applyDiscount(final BigDecimal amount) {
           return amount.multiply(BigDecimal.valueOf(0.9));
       }
    }
    public static void main(String[] args) {
      Discounter discount = new EasterDiscounter();
      BigDecimal d = new BigDecimal(100);
      System.out.println("value is " + d);
      System.out.println("value with discount = " + discount.applyDiscount(d));
      discount = new ChristmasDiscounter();
      System.out.println("value with discount = " + discount.applyDiscount(d));
    }

}
