package br.com.springboot;

import java.util.List;

public interface CRUD<T, ID> {
    T pesquisaPeloId(ID id);
    List<T> lista();
    void insere(T t);
    void atualiza(T t); // Corrected typo from 'atauliza' to 'atualiza'
    void remove(T t);
}
