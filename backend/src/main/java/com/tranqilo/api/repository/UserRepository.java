package com.tranqilo.api.repository;

import com.tranqilo.api.model.Role;
import com.tranqilo.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    // Finds all users with a specific role whose 'coach' field is null.
    List<User> findByRoleAndCoachIsNull(Role role);
}