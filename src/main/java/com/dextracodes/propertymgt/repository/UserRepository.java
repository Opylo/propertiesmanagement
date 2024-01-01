package com.dextracodes.propertymgt.repository;

import com.dextracodes.propertymgt.entity.PropertyEntity;
import com.dextracodes.propertymgt.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    Optional<UserEntity> findByOwnerEmailAndPassword(String email, String password);

    Optional<UserEntity> findByOwnerEmail(String email);
}
