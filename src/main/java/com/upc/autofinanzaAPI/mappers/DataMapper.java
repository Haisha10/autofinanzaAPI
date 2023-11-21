package com.upc.autofinanzaAPI.mappers;

import org.mapstruct.Mapper;

import com.upc.autofinanzaAPI.dtos.DataDto;
import com.upc.autofinanzaAPI.entites.Data;

@Mapper(componentModel = "spring")
public interface DataMapper {
    DataDto toDataDto(Data data);
}
