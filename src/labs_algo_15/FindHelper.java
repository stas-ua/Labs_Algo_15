/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs_algo_15;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author admin
 */
public class FindHelper {

    public static void deleteSomeStudents(List<Student> stList) {
        Calendar cal = Calendar.getInstance();

        for (int i = 0; i < stList.size(); i++) {
            cal.setTime(stList.get(i).getBirthday());
            int month = cal.get(Calendar.MONTH);
            if (stList.get(i).getHobby().equals("turism") && month>=6 && month<=8) {
                stList.remove(i);
                i--;
            }
        }

    }

}
