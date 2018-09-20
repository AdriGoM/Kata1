/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author Usuario
 */
public class Person {
    private final String name;
    private final LocalDate birthday;
    private final long MILLESECONDS_PER_YEAR = (long) (1000*60*60*24*365.24);
    
    
    public Person(String name, LocalDate birthday) {
        this.birthday = birthday;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    
    public int getAge() {
        LocalDate actualDate = LocalDate.now();
        return (int) (Period.between(birthday, actualDate).getYears());
    }
}
