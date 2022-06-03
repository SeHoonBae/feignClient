package com.feign.feignserver.repo;

import com.feign.feignserver.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, String> {

}
