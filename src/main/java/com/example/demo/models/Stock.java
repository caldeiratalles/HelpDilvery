package com.example.demo.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Stock {

    private String item; // item_item
    private String descricao; // descricao_item
    private Integer quantidadeEstoque; // qtd_estoque_item
    private String imagem; // imagem_item
    private Integer categoriaDoItem; // td_categoria_id_categoria_item
    private String username; // login_usuario
    private Integer recebe; // recebe == null(Quer receber uma peça o usuario) ou inteiro(Quando quer doar uma peça para o sistema)
    private Integer doa; // inteiro ou  null(Quando quer doar uma peça para o sistema)
    private Integer quantidadeDoa; // qtd_doa inteiro ou null
    // combinação para requestDonation (null, inteiro(qualquer), quantidade(inteiro))
    // combinação para createDonation (inteiro(qualquer), null, null)
}
