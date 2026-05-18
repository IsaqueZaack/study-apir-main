package br.com.fiap.study_apir.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ProdutoCreateRequest {
    @NotNull
    @Size(min=5, message = "Nome de produto deve ter no mínimo 5 caracteres")
    private String nome;
    
    @Positive(message = "O valor do produto deve ser positivo")
    private BigDecimal valor;
}
