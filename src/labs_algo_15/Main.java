/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs_algo_15;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Student> lst = new ArrayList();

        lst.add(new Student("Ivan", "Ivanov", "math", "01.01.1990"));
        lst.add(new Student("Petr", "Petrov", "geo", "01.06.1990"));
        lst.add(new Student("Sidor", "Sidorov", "turism", "05.07.1990"));
        lst.add(new Student("Dart", "Vader", "football", "01.01.1990"));
        lst.add(new Student("Roman", "Romanov", "alp", "01.01.1990"));
        lst.add(new Student("Vasya", "Vasylev", "swiming", "01.01.1990"));
        lst.add(new Student("Vitya", "Viktorov", "turism", "01.01.1990"));
        lst.add(new Student("Michael", "Michailov", "rowing", "01.01.1990"));
        lst.add(new Student("Senya", "Semenov", "swiming", "01.01.1990"));
        lst.add(new Student("Anton", "Antonov", "turism", "28.08.1995"));

        for (Student st : lst) {
            System.out.println(st.getName() + " " + st.getLastName()
                    + " " + st.getHobby() + " " + st.getBirthday());
        }

        System.out.println();
        FindHelper.deleteSomeStudents(lst);

        for (Student st : lst) {
            System.out.println(st.getName() + " " + st.getLastName()
                    + " " + st.getHobby() + " " + st.getBirthday());
        }

    }

}
