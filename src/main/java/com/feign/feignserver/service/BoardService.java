package com.feign.feignserver.service;

import com.feign.feignserver.dto.BoardDto;
import com.feign.feignserver.entity.Board;
import com.feign.feignserver.mapper.BoardMapper;
import com.feign.feignserver.repo.BoardRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepo boardRepo;


    public BoardDto findById(Long id) {

        BoardDto result = null;

        try {
            Board board = boardRepo.findById(id)
                    .orElseThrow(() -> new Exception("board not exist"));

            result = BoardMapper.INSTANCE.toDto(board);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    public List<BoardDto> findAll(){

        List<BoardDto> result = new ArrayList<>();

        boardRepo.findAll()
                .stream().forEach(board -> {
                    result.add(BoardMapper.INSTANCE.toDto(board));
                });

        return result;
    }
}
