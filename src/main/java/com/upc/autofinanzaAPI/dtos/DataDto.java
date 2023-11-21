package com.upc.autofinanzaAPI.dtos;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DataDto {
    private Long user_id;
    private String tipo_moneda;
    private Double precio;
    private Double cuota_inicial;
    private Boolean isCuotaInicial;
    private Double capital;
    private Boolean isCapital;
    private String banco;
    private Boolean isNominal;
    private Boolean isNominalCheckbox;
    private Double valor_tasa_nominal;
    private Double capitalizacion;
    private Boolean isEfectiva;
    private Boolean isEfectivaCheckbox;
    private Double valor_tasa_efectiva;
    private Double frecuencia_pago;
    private Date inicio;
    private Date fin;
    private Double total_desde;
    private Double total_cantidad;
    private Double parcial_desde;
    private Double parcial_cantidad;
}
