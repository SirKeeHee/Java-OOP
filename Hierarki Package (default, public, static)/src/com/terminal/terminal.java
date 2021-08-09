package com.terminal;

//visibilitas untuk semuanya
public class terminal {
    public static void log(String message){
        System.out.println(message);
    }
}

//ini hanya akan bisa diakses dari package com.console
//public class console {
//    public static void log(String message) {
//        System.out.println(message);
//    }
//}
