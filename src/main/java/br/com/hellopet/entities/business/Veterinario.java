package br.com.hellopet.entities.business;

import br.com.hellopet.entities.core.Endereco;
import br.com.hellopet.entities.customer.enums.Especie;
import br.com.hellopet.entities.business.enums.ProcedimentoCategoria;

import java.time.LocalDate;
import java.util.List;

public record Veterinario(
        List<Especie> especies,
        List<ProcedimentoCategoria> categorias,
        List<ProcedimentoTipo> procedimentoTipos,
        Long id,
        String cpf,
        String crmv,
        String nome,
        String email,
        String telefone,
        String celular,
        Endereco endereco,
        LocalDate dataCadastro,
        Boolean ativo
) {
}