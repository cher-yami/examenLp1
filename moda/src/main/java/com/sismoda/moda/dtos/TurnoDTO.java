package com.sismoda.moda.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TurnoDTO {
    private Long idTurno;
    @NotNull(message = "El nombre no puede ser nulo")
    private String nombre;
}
