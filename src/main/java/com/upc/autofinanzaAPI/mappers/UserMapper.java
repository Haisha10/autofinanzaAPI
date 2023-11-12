package com.upc.autofinanzaAPI.mappers;

import com.upc.autofinanzaAPI.dtos.SignUpDto;
import com.upc.autofinanzaAPI.dtos.UserDto;
import com.upc.autofinanzaAPI.entites.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}
