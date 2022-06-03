package com.feign.feignserver.controller;

import com.feign.feignserver.dto.UserDto;
import com.feign.feignserver.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping()
    public UserDto getUser(@RequestParam String userId){

        return userService.findByUser(userId);

    }

    @PostMapping
    public UserDto addUser(@RequestBody UserDto requestUserDto){

        return userService.save(requestUserDto);

    }


}
