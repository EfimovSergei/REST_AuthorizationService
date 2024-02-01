package ru.efimov.authorizationservice.repository;

import org.springframework.stereotype.Repository;
import ru.efimov.authorizationservice.service.Authorities;

import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {

        if (user.equals("admin") && password.equals("admin"))
            return List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        if (user.equals("writer") && password.equals("writer"))
            return List.of(Authorities.WRITE);
        if (user.equals("reader") && password.equals("reader"))
            return List.of(Authorities.WRITE);
        if (user.equals("remover") && password.equals("remover"))
            return List.of(Authorities.DELETE);
        return null;

    }
}