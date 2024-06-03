package med.voll.api.controll;

import med.voll.api.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @PostMapping
    public void cadastrarPaciente(@RequestBody DadosCadastroPaciente dadosPaciente){

        System.out.println("dados recebidos dos pacientes: " + dadosPaciente);

    }

}
