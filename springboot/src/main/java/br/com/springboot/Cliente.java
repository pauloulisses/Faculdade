package br.com.springboot;

import org.checkerframework.checker.signature.qual.Identifier;
import org.flywaydb.core.internal.util.LocalDateTimeSerializer;
import org.mockito.internal.util.collections.Sets;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.format.annotation.DateTimeFormat;

import com.google.common.collect.Tables;
import com.mysql.cj.x.protobuf.MysqlxCrud.Column;

import io.micrometer.common.lang.Nullable;
import jakarta.annotation.Generated;

@EntityScan
@Table(name="clientes")

public class Cliente {
    @Identifier
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @column(nullable = false, length = 50)
    private String nome;
    @Colum(length = 11)
    private String cpf;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "data_nascimento", columnDefinition = "DATE")
    private LocalDateTimeSerializer dataDeNascimento;
    @Enumerated(EnumType.String)
    private Sets sexo;
    @column(length = 10)
    private String telefone;
    @column(length = 11)
    private String celular;
    @column(length = 50)
    private String email;
    private boolean ativo;

    public long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public LocalDateTimeSerializer getDataDeNascimento() {
        return dataDeNascimento;
    }
    public Sets getSexo() {
        return sexo;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getCelular() {
        return celular;
    }
    public String getEmail() {
        return email;
    }




