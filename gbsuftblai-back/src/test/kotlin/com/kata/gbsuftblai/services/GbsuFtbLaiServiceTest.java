package com.kata.gbsuftblai.services;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class GbsuFtbLaiServiceTest {

    @Autowired
    private GbsuFtbLaiService service;

    @Test
    @Order(1)
    void should_return_1_when_inputNumberEquals1() {
        // Given:
        int inputNumber = 1;
        // When:
        String result = service.convertNumber(inputNumber);
        // Then:
        assertEquals("1", result);
    }

    @Test
    @Order(2)
    void should_return_GbsuGbsu_when_inputNumberEquals3() {
        // Given:
        int inputNumber = 3;
        // When:
        String result = service.convertNumber(inputNumber);
        // Then:
        assertEquals("GbsuGbsu", result);
    }

    @Test
    @Order(3)
    void should_return_FtbFtb_when_inputNumberEquals5() {
        // Given:
        int inputNumber = 5;
        // When:
        String result = service.convertNumber(inputNumber);
        // Then:
        assertEquals("FtbFtb", result);
    }

    @Test
    @Order(4)
    void should_return_Lai_when_inputNumberEquals7() {
        // Given:
        int inputNumber = 7;
        // When:
        String result = service.convertNumber(inputNumber);
        // Then:
        assertEquals("Lai", result);
    }

    @Test
    @Order(5)
    void should_return_Lai_when_inputNumberEquals9() {
        // Given:
        int inputNumber = 9;
        // When:
        String result = service.convertNumber(inputNumber);
        // Then:
        assertEquals("Gbsu", result);
    }

    @Test
    @Order(6)
    void should_return_GbsuFtb_when_inputNumberEquals51() {
        // Given:
        int inputNumber = 51;
        // When:
        String result = service.convertNumber(inputNumber);
        // Then:
        assertEquals("GbsuFtb", result);
    }

    @Test
    @Order(7)
    void should_return_FtbGbsu_when_inputNumberEquals53() {
        // Given:
        int inputNumber = 53;
        // When:
        String result = service.convertNumber(inputNumber);
        // Then:
        assertEquals("FtbGbsu", result);
    }

    @Test
    @Order(8)
    void should_return_GbsuGbsuGbsu_when_inputNumberEquals33() {
        // Given:
        int inputNumber = 33;
        // When:
        String result = service.convertNumber(inputNumber);
        // Then:
        assertEquals("GbsuGbsuGbsu", result);
    }

    @Test
    @Order(9)
    void should_return_GbsuLai_when_inputNumberEquals27() {
        // Given:
        int inputNumber = 27;
        // When:
        String result = service.convertNumber(inputNumber);
        // Then:
        assertEquals("GbsuLai", result);
    }

    @Test
    @Order(10)
    void should_return_GbsuFtbFtb_when_inputNumberEquals15() {
        // Given:
        int inputNumber = 15;
        // When:
        String result = service.convertNumber(inputNumber);
        // Then:
        assertEquals("GbsuFtbFtb", result);
    }

    @Test
    @Order(11)
    void should_return_GbsuFtbFtb_when_inputNumberEquals105() {
        // Given:
        int inputNumber = 105;
        // When:
        String result = service.convertNumber(inputNumber);
        // Then:
        assertEquals("GbsuFtbFtb", result);
    }

}