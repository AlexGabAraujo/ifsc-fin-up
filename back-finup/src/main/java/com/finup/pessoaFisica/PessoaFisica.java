package com.finup.pessoaFisica;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Table(name = "pessoa_fisica")
@Entity(name = "PessoaFisica")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class PessoaFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate dataNascimento;
    private LocalDateTime data_inicio;
    private LocalDateTime data_fim;
    private Boolean ativo;
}
