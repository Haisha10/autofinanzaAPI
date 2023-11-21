package com.upc.autofinanzaAPI.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upc.autofinanzaAPI.dtos.DataDto;
import com.upc.autofinanzaAPI.entites.Data;
import com.upc.autofinanzaAPI.entites.User;
import com.upc.autofinanzaAPI.repositories.DataRepository;
import com.upc.autofinanzaAPI.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DataService {
    private final DataRepository dataRepository;
    private final UserRepository userRepository;

    public DataDto createData(DataDto dataDto) {
        User user = userRepository.findById(dataDto.getUser_id()).orElse(null);
        Data data = new Data(0l, dataDto.getTipo_moneda(), dataDto.getPrecio(), dataDto.getCuota_inicial(),
                dataDto.getIsCuotaInicial(), dataDto.getCapital(), dataDto.getIsCapital(), dataDto.getBanco(),
                dataDto.getIsNominal(), dataDto.getIsNominalCheckbox(), dataDto.getValor_tasa_nominal(),
                dataDto.getCapitalizacion(), dataDto.getIsEfectiva(), dataDto.getIsEfectivaCheckbox(),
                dataDto.getValor_tasa_efectiva(), dataDto.getFrecuencia_pago(), dataDto.getInicio(), dataDto.getFin(),
                dataDto.getTotal_desde(), dataDto.getTotal_cantidad(), dataDto.getParcial_desde(),
                dataDto.getParcial_cantidad(), user);
        dataRepository.save(data);
        return dataDto;
    }

    public Optional<DataDto> getData(Long userId) {
        Data data = dataRepository.findByUserId(userId).orElse(null);
        if (data == null) {
            return null;
        }
        DataDto dataDto = new DataDto(data.getUser().getId(), data.getTipo_moneda(), data.getPrecio(),
                data.getCuota_inicial(),
                data.getIsCuotaInicial(), data.getCapital(), data.getIsCapital(), data.getBanco(), data.getIsNominal(),
                data.getIsNominalCheckbox(), data.getValor_tasa_nominal(), data.getCapitalizacion(),
                data.getIsEfectiva(), data.getIsEfectivaCheckbox(), data.getValor_tasa_efectiva(),
                data.getFrecuencia_pago(), data.getInicio(), data.getFin(), data.getTotal_desde(),
                data.getTotal_cantidad(), data.getParcial_desde(), data.getParcial_cantidad());
        return dataDto == null ? Optional.empty() : Optional.of(dataDto);
    }
}
