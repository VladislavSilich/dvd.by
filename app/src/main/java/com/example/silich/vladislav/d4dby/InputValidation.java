package com.example.silich.vladislav.d4dby;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Lenovo on 11.09.2017.
 */

public class InputValidation {

    public static boolean checkPasswordEquals(String pas1, String pas2, Context context) {
        if (!pas1.equals(pas2)) {
            Toast.makeText(context, "Введённые пароли не совпадают", Toast.LENGTH_LONG).show();
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkEmptyData(String login,String pas1, Context context) {
        if (login.isEmpty() || pas1.isEmpty()) {
            Toast.makeText(context, "Пустое поле", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    public static boolean checkLengthPass(String name,String pas,Context context){
          if (name.length() < 4){
             Toast.makeText(context,
                     "Login must contain at least 4 characters",Toast.LENGTH_LONG ).show();
             return false;
         }else if (pas.length() < 8 ){
              Toast.makeText(context,
                      "Password must contain at least 8 characters",Toast.LENGTH_LONG ).show();
              return false;
          }
        return true;
    }
    public static boolean checkEmptyData(String name,String email,String pass,String repeatPass,Context context){
        if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || repeatPass.isEmpty()) {
            Toast.makeText(context, "Пустое поле", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    public static boolean checkCheckBox(boolean checkBox1,boolean checkBox2,Context context){
        if (checkBox1 == false && checkBox2 == false){
            Toast.makeText(context, "Укажите,вы продавец/покупатель?", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }
}
