package med.voll.api.endereco;

/**
 *  Classe Record utilizada para manipularmos os dados vindo do json (UTILIZACAO DO PADRAO DTO)
 *   seu objetivo é apenas representar dados que serão recebidos ou devolvidos pela API
 * @param logradouro
 * @param bairro
 * @param cep
 * @param cidade
 * @param uf
 * @param complemento
 * @param numero
 */
public record DadosEndereco(String logradouro, String bairro, String cep, String cidade, String uf, String complemento, String numero) {
}
