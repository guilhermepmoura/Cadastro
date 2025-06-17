package com.exemplo.cadastro.Missoes;

import com.exemplo.cadastro.Usuarios.UsuarioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name= "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;


@OneToMany(mappedBy = "missoes") // Uma missão pode ter vários usuários.
    private List<UsuarioModel> usuario;

}
