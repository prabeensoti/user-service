package edu.miu.cs590.userservice.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderUtil {

    public static PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(10);
    }
}
