package com.p1;

import com.p2.SecondFile;
import  org.joda.time.*;
import java.util.*;

public class App 
{
    // using joda-time library
    public static int checkMonth() {
        Date d = new Date();
        DateTime dt = new DateTime(d);
        return dt.getMonthOfYear();
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("x from app.java"+ " "+ SecondFile.x);
    }
}
