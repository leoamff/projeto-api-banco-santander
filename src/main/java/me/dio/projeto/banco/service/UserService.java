package me.dio.projeto.banco.service;

import me.dio.projeto.banco.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
