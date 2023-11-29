package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,//verifica se é null ou vazio. Funciona apenas em campos string.
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
