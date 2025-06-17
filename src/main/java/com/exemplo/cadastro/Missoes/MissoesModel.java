package com.exemplo.cadastro.Missoes;

import com.exemplo.cadastro.Usuarios.UsuarioModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;


@OneToMany(mappedBy = "missoes") // Uma missão pode ter vários usuários.
    private List<UsuarioModel> usuario;


    public MissoesModel() {
    }
}
