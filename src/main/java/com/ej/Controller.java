package com.ej;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/a")
    public String algo(){
        return "Hola si sirve aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    }

    private void ab(){
        System.out.println("");
    }

    private String cccc(){
        if (true){
            if (false){
                return "a";
            }
        }
        return null;
    }

    private static int shuuu(int aaaaaa, String xxxx){
        //aaaaaaaaaaaaaaaaaaaaaaaaaaa
        //bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
        //ooooooooooooooooooooooooooooooooooo
        System.out.println("");
        return 0;
    }

    private void llll(){}

    private void eee(){
        //todo
    }

    private byte ss(){
        //not todo
        return 0x01;  //hace muchas thinngs
    }


}
