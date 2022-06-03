package com.feign.feignserver.mapper;

import com.feign.feignserver.dto.BoardDto;
import com.feign.feignserver.entity.Board;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BoardMapper extends StructMapper<BoardDto, Board> {

    BoardMapper INSTANCE = Mappers.getMapper(BoardMapper.class);

    @Override
    @Mapping(source = "user.userId", target = "userId")
    BoardDto toDto(Board board);

}
