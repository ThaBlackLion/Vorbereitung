package com.example.vorbereitung;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class VorbereitungApplicationTests {
    Implemantation sut = new Implemantation();
    @Test
    public void testouncesToGram() {
        var result= sut.ouncesToGram(1);
        var expected= 28.35;
        assertEquals(expected, result);
    }
    @Test
    public void teststonesToKilogram(){
        var result= sut.stonesToKilograms(1);
        var expected=6.35;
        assertEquals(expected,result);
    }
}
