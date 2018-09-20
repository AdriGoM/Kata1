/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Person {
    String name;
    Date birthday;
    
    public Person(String name, Date birthday) {
        this.birthday = birthday;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge() {
        return (int)((new Date().getTime() - this.birthday.getTime())/31536000000L);
    }
}
