package br.com.fiap.locatech.locatech.repositories;

import br.com.fiap.locatech.locatech.entities.Veiculo;

import java.util.List;
import java.util.Optional;

public interface VeiculoRepository {
    Optional<Veiculo> findById(Long id);
    /**
     * Optional pois pode ser que haja ou não o id cadastrado
     */

    List<Veiculo> findAll(int size, int offset);
    /**
     * A frota de veículos é numerada de 0 ao infinito, digamos que
     * queira trazer os 10 primeiros dessa frota (0 ao 9) e
     * depois do 10 ao 19, o que define esse range é o offset
      */

    Integer save(Veiculo veiculo);
    /**
     * Por que um Integer?
     * Ele irá retornar a quantidade de linhas foram alteradas no banco de dados
     */

    Integer update(Veiculo veiculo, Long id);

    Integer delete(Long id);

}