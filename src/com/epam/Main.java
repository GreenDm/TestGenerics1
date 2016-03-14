package com.epam;

import java.util.DoubleSummaryStatistics;
import java.util.Locale;

/**
 * Created by m18 on 14.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        MyTuple <String,Integer,Long> tuple1 = new MyTuple<>("Lol",10,102l);
        MyTuple <Double,String,String> tuple2 =new MyTuple<>(5.5,"Ouch","Ror");

        System.out.println( tuple1 );
        System.out.println( tuple2 );

    }
}
