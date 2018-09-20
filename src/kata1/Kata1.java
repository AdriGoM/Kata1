/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate date = LocalDate.of(1997, Month.JUNE, 16);
        Person p = new Person("Adrián", date);
        System.out.println(p.getName() + " tiene " + p.getAge() + " años");
    }
    
}
