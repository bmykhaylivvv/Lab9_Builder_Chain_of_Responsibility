package builder;

import atm.ATM;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    User user;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));

        user = user = User.builder()
                .firstName("Jack")
                .lastName("London")
                .occupation("Programmer")
                .occupation("Entrepreneur")
                .gender("Male")
                .age(41)
                .build();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.setOut(System.out);
    }


    @org.junit.jupiter.api.Test
    public void toStringTest() {
        System.out.println(user);

        assertTrue(outContent.toString().contains("User(firstName=Jack, lastName=London, occupations=[Programmer, Entrepreneur], gender=Male, age=41, weight=0)"));
    }



}