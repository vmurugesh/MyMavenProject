package mymavenpackage;

import org.jetbrains.annotations.NotNull;

import java.util.ResourceBundle;

import static java.util.ResourceBundle.getBundle;

public class MyJavaPrg {
    public int userlogin(@NotNull String usr, String pwd)
    {
        ResourceBundle rb = getBundle("config");

        String uname=rb.getString("username");
        String word=rb.getString("password");

        if (usr.equals("uname") && pwd.equals("word"))
            return 1;
        else
            return 0;
    }

}
