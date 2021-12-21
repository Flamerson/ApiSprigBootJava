package br.com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.models.User;

public interface UserRepository extends JpaRepository<User,Long> {

    //achar usuario pelo nome   //para ele utilizar o ignoreCase basta adicionar apos o parametro
    public List<User> findByNameIgnoreCase(String name);

}

