package com.mongoDB.SpringData.repository;

import com.mongoDB.SpringData.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // Puedes agregar métodos personalizados aquí si los necesitas
}
