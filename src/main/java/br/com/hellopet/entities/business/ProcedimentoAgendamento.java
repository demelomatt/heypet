package br.com.hellopet.entities.business;

import br.com.hellopet.entities.customer.Pet;
import br.com.hellopet.entities.customer.Tutor;
import br.com.hellopet.entities.business.enums.ProcedimentoStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ProcedimentoAgendamento(
        Procedimento procedimento,
        Veterinario veterinario,
        Pet pet,
        Tutor tutor,
        ProcedimentoStatus status,
        LocalDateTime horarioProcedimento,
        BigDecimal valorTotal
) {
}
