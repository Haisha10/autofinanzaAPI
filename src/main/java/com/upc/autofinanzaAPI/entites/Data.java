package com.upc.autofinanzaAPI.entites;

import java.sql.Date;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@lombok.Data
@Entity
@Table(name = "master_data")
public class Data {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_moneda", nullable = false)
    @Size(max = 100)
    private String tipo_moneda;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "cuota_inicial", nullable = false)
    private Double cuota_inicial;

    @Column(name = "is_cuota_inicial", nullable = false)
    private Boolean isCuotaInicial;

    @Column(name = "capital", nullable = false)
    private Double capital;

    @Column(name = "is_capital", nullable = false)
    private Boolean isCapital;

    @Column(name = "banco", nullable = false)
    @Size(max = 100)
    private String banco;

    @Column(name = "is_nominal", nullable = false)
    private Boolean isNominal;

    @Column(name = "is_nominal_checkbox", nullable = false)
    private Boolean isNominalCheckbox;

    @Column(name = "valor_tasa_nominal", nullable = false)
    private Double valor_tasa_nominal;

    @Column(name = "capitalizacion", nullable = false)
    private Double capitalizacion;

    @Column(name = "is_efectiva", nullable = false)
    private Boolean isEfectiva;

    @Column(name = "is_efectiva_checkbox", nullable = false)
    private Boolean isEfectivaCheckbox;

    @Column(name = "valor_tasa_efectiva", nullable = false)
    private Double valor_tasa_efectiva;

    @Column(name = "frecuencia_pago", nullable = false)
    private Double frecuencia_pago;

    @Column(name = "inicio", nullable = false)
    private Date inicio;

    @Column(name = "fin", nullable = false)
    private Date fin;

    @Column(name = "total_desde", nullable = false)
    private Double total_desde;

    @Column(name = "total_cantidad", nullable = false)
    private Double total_cantidad;

    @Column(name = "parcial_desde", nullable = false)
    private Double parcial_desde;

    @Column(name = "parcial_cantidad", nullable = false)
    private Double parcial_cantidad;

    //Join with user id
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
