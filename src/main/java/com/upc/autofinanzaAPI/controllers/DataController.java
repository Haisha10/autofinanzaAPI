package com.upc.autofinanzaAPI.controllers;

import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.upc.autofinanzaAPI.dtos.DataDto;
import com.upc.autofinanzaAPI.services.DataService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class DataController {
    private final DataService dataService;

    @PostMapping("/masterdata")
    public ResponseEntity<DataDto> create(@RequestBody @Valid DataDto dataDto) {
        DataDto createdData = dataService.createData(dataDto);
        return ResponseEntity.ok(createdData);
    }

    @GetMapping("/masterdata")
    public ResponseEntity<Optional<DataDto>> get(@Param("user_id") Long userId) {
        Optional<DataDto> dataDto = dataService.getData(userId);
        return ResponseEntity.ok(dataDto);
    }
}
