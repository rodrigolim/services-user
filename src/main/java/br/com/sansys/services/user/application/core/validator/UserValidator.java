package br.com.sansys.services.user.application.core.validator;

import br.com.sansys.services.user.application.core.domains.User;

import java.util.Objects;

public final class UserValidator {

    private UserValidator(){
    }

    public static boolean isValid(User user){
        return Objects.nonNull(user) && isAgeValid(user.getAge());
    }

    public static boolean isAgeValid(int age){
        return age >= 18;
    }

}
