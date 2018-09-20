/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Person {
    private final String name;
    private final Calendar birthday;
    private final long MILLESECONDS_PER_YEAR = (long) (1000*60*60*24*365.24);
    
    
    public Person(String name, Calendar birthday) {
        this.birthday = birthday;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }
    
    public int getAge() {
        Calendar today = Calendar.getInstance();
        return (int) (millesecondsToYear(today.getTimeInMillis()-
                birthday.getTimeInMillis()));
    }
    
    private long millesecondsToYear(long milles) {
        return milles / MILLESECONDS_PER_YEAR; 
    }
}
