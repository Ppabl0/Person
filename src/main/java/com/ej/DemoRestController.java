package com.ej;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @GetMapping("/a")
    public String algo(){
        return "Hola si sirve bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
    }

    public static int suma1(){
        return 1;
    }

    public static String saludo(){
        return "saludo";
    }

    public static int suma2(){
        return 0b10;
    }

    public static int suma3(){
        return 0x3;
    }

    public static int suma4(){
        return 4;
    }

    public static int suma5(){ return 5;}

    public static int suma6(){return 0b110;}

    public static int suma7(){return 0x7;}

//    private static int shuuu(int aaaaaa, String xxxx){
//        //aaaaaaaaaaaaaaaaaaaaaaaaaaa
//        //bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
//        //ooooooooooooooooooooooooooooooooooo
//        System.out.println("");
//        return 0;
//    }
//
//    private void llll(){}
//
//    private void eee(){
//        //todo
//    }
//
//    private byte ss(){
//        //not todo
//        return 0x01;  //hace muchas thinngs
//    }


}
