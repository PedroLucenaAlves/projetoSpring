package med.voll.api.medico;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import med.voll.api.endereco.Endereco;

/**
 * Entidade JPA
 */

@Table(name = "medicos") //nome na tabela
@Entity(name = "Medico") //informando a JPA o nome da Entidade

//lombok
@Getter
@NoArgsConstructor //construtor sem argumentos
@AllArgsConstructor
@EqualsAndHashCode(of = "id") //gera o hashcode apenas em cima do id

public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    //mapeando a entidade Endereco utilizando essa anotacao
    @Embedded
    private Endereco endereco;

    //criando construtor para informar os dados na classe Controller *simplificando as linhas*
    public Medico(DadosCadastroMedico dados){
        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco()); //instanciando o Endereco

    }

}