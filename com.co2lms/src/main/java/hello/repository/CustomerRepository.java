package hello.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import hello.domain.Hello;

public interface CustomerRepository extends CrudRepository<Hello, Long> {

    List<Hello> findByName(String Name);
    
    List<Hello> findAll();
    
}
