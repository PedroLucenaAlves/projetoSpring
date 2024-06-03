package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

/**
 * Classe Record utilizada para manipularmos os dados vindo do json (UTILIZACAO DO PADRAO DTO)
 * seu objetivo é apenas representar dados que serão recebidos ou devolvidos pela API
 * @param nome
 * @param email
 * @param crm
 * @param especialidade
 * @param endereco
 */

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
