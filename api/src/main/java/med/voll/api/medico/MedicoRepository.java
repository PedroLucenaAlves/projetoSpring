package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Utilizando o metodo DAO de outros projetos Java , porem nas regras do SpringData
 * Evitando utilizar metodos Dao como EntityManager etc. O Sprign faz automaticamente
 */
                                //Informando a Interface da JPA 1-Tipo da entidade / 2-Tipo do atributo da chave primaria
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
