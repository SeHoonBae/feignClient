package com.feign.feignserver.mapper;

import com.feign.feignserver.dto.UserDto;
import com.feign.feignserver.entity.Users;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UsersMapper extends StructMapper<UserDto, Users>{

    UsersMapper INSTANCE = Mappers.getMapper(UsersMapper.class);


}
