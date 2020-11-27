package com.stardust.user;

import com.stardust.StardustApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Import;

@Import(StardustApplication.class)
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
