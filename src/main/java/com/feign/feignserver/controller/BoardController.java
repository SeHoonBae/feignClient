package com.feign.feignserver.controller;

import com.feign.feignserver.dto.BoardDto;
import com.feign.feignserver.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping
    public BoardDto getBoard(@RequestParam Long id){
        return boardService.findById(id);
    }

    @GetMapping("/list")
    public List<BoardDto> getList(){
        return boardService.findAll();
    }

}
