package com.feign.feignserver.repo;

import com.feign.feignserver.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepo extends JpaRepository<Board, Long> {

}
