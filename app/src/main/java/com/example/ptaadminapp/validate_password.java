package com.example.ptaadminapp;

import java.util.regex.Pattern;

public class validate_password {

    public static final Pattern PATTERN_PASSWORD =
            Pattern.compile("^"
                    + "(?=.*[0-9])"                  //minimum one number
                    + "(?=.*[a-z])"                  //minimum one lower case character
                    + "(?=.*[A-Z])"                  //minimum one UPPER case character
                    + "(?=.*[a-zA-Z])"               //any character
                    + "(?=.*[@#$%^&+=])"             //minimum one special character
                    + "(?=\\S+$)"                    //no white spaces
                    + ".{6,}"                        //minimum length 6 characters
                    + "$");

    //  public static final Pattern PATTERN_UPPERCASE_PASSWORD =
    //          Pattern.compile("(?=.*[A-Z])" + ".{0,}");

    //  public static final Pattern PATTERN_LOWERCASE_PASSWORD =
    //          Pattern.compile("(?=.*[a-z])" + ".{0,}");

    //  public static final Pattern PATTERN_NUMBER_PASSWORD =
    //          Pattern.compile("(?=.*[0-9])" + ".{0,}");

    //   public static final Pattern PATTERN_SPECIAL_CHARACTER_PASSWORD =
    //          Pattern.compile("(?=.*[@#$%^&+=])" + ".{0,}");

    //  public static final Pattern PATTERN_LENGTH_CHARACTER_PASSWORD =
    //         Pattern.compile(".{6,}" + ".{0,}");
}
