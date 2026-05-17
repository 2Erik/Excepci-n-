package com.krakeDev.Taller.Exepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int c = a / b;
            LOGGER.info("El resultado es: " + c);

        } catch (Exception e) {
            LOGGER.error("Error matematico", e);
        }
    }
}
