package me.dio.projeto.banco.domain.repository;

import me.dio.projeto.banco.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Boolean existsByAccountNumber(String accountNumber);
}
