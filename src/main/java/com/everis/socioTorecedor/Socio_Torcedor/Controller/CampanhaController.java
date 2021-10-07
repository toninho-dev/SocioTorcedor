package com.everis.socioTorecedor.Socio_Torcedor.Controller;

import com.everis.socioTorecedor.Socio_Torcedor.Model.CampanhaModel;
import com.everis.socioTorecedor.Socio_Torcedor.service.CampanhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping(path = "/campanha")
public class CampanhaController {
    @Autowired
    private CampanhaService campanhaService;

    @GetMapping
    public ResponseEntity<?> ConsultaCampanhaPorID(@RequestParam Integer id) {
        return campanhaService.consultaPorID(id);
    }

    @GetMapping(path = "/lista")
    public List<?> consultarTodos() {
        return campanhaService.consultarTodos();
    }
    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody @Valid CampanhaModel campanhaModel) {
        return campanhaService.salvar(campanhaModel);
    }

//    @DeleteMapping
//    public ResponseEntity<?> delete(@RequestParam("cpf") String cpf) {
//        return clienteService.delete(cpf);
//    }
//
//    @PutMapping
//    public ResponseEntity<?> atualizar(@RequestParam("cpf") String cpf, @RequestBody @Valid ClienteModelDto cliente) {
//        return clienteService.atualizar(cpf,cliente);
//    }
}
