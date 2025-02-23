package com.spring.api_rfc.spring_rfc.repo;

import com.spring.api_rfc.spring_rfc.model.TblRequestRfc;
import com.spring.api_rfc.spring_rfc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByNik(String nik);
    List<User> findBySmCodeAndStatus(String smCode, String status);
    List<User> findByPositionAndStatus(String position, String status);
}
