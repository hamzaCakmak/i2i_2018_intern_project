package com.example.zeynep.cell2i;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.widget.EditText;

/**
 * Created by Zeynep on 4.07.2018.
 */

public class SubScribe extends MainActivity  {

    public static boolean checkUsername(String username, String password) {

        boolean is_valid = false;
        if (!username.isEmpty() && !password.isEmpty()) {



                is_valid = true;

        }


            return is_valid;
    }


    public static boolean changePassword(String username, String newpassword, String confirmpassword) {

        boolean is_valid = false;

            if (username.equals("admin")  && confirmpassword.equals(newpassword)) {
                is_valid = true;

            }

        return is_valid;
    }





    //** login thread sonu


}
