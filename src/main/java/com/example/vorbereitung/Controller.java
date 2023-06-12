package com.example.vorbereitung;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    Implemantation i = new Implemantation();

    @RequestMapping("/ouncesToGram")
    public double ouncesToGram(@RequestParam double oz){

        return i.ouncesToGram(oz);
    }
        @RequestMapping("/stonesToKilogram")
        public double stonesToKilogram(@RequestParam double st){
            return i.stonesToKilograms(st);
        }
    }

