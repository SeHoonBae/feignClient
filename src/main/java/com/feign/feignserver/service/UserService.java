package com.feign.feignserver.service;

import com.feign.feignserver.dto.UserDto;
import com.feign.feignserver.entity.Users;
import com.feign.feignserver.mapper.UsersMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.feign.feignserver.repo.UserRepo;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepo userRepo;
//    private final Logger log;

    public UserDto findByUser(String userId){

        UserDto result = new UserDto();

        try {
            Users user = userRepo.findById(userId)
                    .orElseThrow(
                            () -> new Exception("user not exist")
                    );

            result.setUserId(user.getUserId());
            result.setUserName(user.getUserName());
        }catch (Exception e){
            log.debug(e.getMessage());
        }
        return result;
    }

    public UserDto save(UserDto requestUserDto) {

        Users users = UsersMapper.INSTANCE.toEntity(requestUserDto); // entity에 setter가 있어야함

        Users result = userRepo.save(users);

        UserDto userDto = UsersMapper.INSTANCE.toDto(result);

        return userDto;
    }
}
