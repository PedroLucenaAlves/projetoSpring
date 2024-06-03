package med.voll.api.controll;


import med.voll.api.medico.DadosCadastroMedico;

import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    //informando ao Spring que o atributo deve ser instanciado pelo Spring *Injeção de Dependencias*
    @Autowired
    private MedicoRepository repository;

    @PostMapping //METODO HTTP POST
    public void cadastrar(@RequestBody DadosCadastroMedico dados){ //RequestBody exibe o corpo da requisicao do Json

           // repository.save(new Medico(null, dados.nome(), dados.email(), dados.crm(), new Endereco(dao)));
            repository.save(new Medico(dados)); //entidade JPA medico


    }

}
