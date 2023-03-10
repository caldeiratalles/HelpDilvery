package com.example.demo.models.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CategoriaItemDTO {

    private String item;
    private Integer id_item;
    private String descricao;
    private Integer qtd_estoque;
    private String imagem;
}
