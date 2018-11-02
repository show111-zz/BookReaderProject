package com.huilee.improject.bookreaderproject.utils;

import com.huilee.improject.bookreaderproject.BuildConfig;
/*
 * Created by huilee on 2018-11-01
 */
public class Constants {

    public static String BASE_URL;

    static {
        if(BuildConfig.DEBUG){
            BASE_URL = "http://192.168.5.87:3389";
        }else{
            // release url
            BASE_URL = "http://";
        }
    }



}
