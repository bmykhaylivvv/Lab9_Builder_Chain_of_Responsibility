package builder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Jack")
                .lastName("London")
                .occupation("Programmer")
                .occupation("Entrepreneur")
                .gender("Male")
                .age(41)
                .build();

        System.out.println(user);
    }


}
