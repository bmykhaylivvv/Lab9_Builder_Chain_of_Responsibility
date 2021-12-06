package atm;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    ATM atm;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));

        atm = new ATM();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.setOut(System.out);
    }


    @org.junit.jupiter.api.Test
    public void processSuccessTest() {
        atm.process(225);

        assertTrue(outContent.toString().contains("Please receive 1 of 5 UAH Bills"));
        assertTrue(outContent.toString().contains("Please receive 0 of 10 UAH Bills"));
        assertTrue(outContent.toString().contains("Please receive 11 of 20 UAH Bills"));

    }

    @org.junit.jupiter.api.Test
    public void processNoBillsExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> { atm.process(211); });

    }
}