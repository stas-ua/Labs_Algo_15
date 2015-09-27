/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs_algo_15;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Student {
   
    private String Name;
    private String LastName;
    private Date birthday;
    private String hobby;
   
    
    public Student(String n, String ln, String hobby, String birth)
    {
        Name = n;
        LastName = ln;
        
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date(0);
        try {
            date = format.parse(birth);
        } catch (ParseException ex) {
            //Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        birthday = date;
        this.hobby = hobby;        
    }
    

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the year
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the year to set
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    
    public String getHobby() {
        return hobby;
    }

   
    public void setHobby(String fcl) {
        this.hobby = fcl;
    }


    
}
