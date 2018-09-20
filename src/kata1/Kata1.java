/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

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
        Calendar date;
        date = Calendar.getInstance();
        date.set(1997, 06, 16);
        Person p = new Person("Adrián", date);
        System.out.println(p.getName() + " tiene " + p.getAge() + " años");
    }
    
}
