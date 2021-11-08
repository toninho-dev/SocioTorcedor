package com.everis.socioTorecedor.Socio_Torcedor.Controller;

import com.everis.socioTorecedor.Socio_Torcedor.Controller.response.TorcedorResponse;
import com.everis.socioTorecedor.Socio_Torcedor.Model.TorcedorModel;
import com.everis.socioTorecedor.Socio_Torcedor.service.TorcedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping(path = "/torcedor")
public class TorcedorController {

    @Autowired
    private TorcedorService torcedorService;

    @GetMapping({"id"})
    public ResponseEntity<?> ConsultaTorcedorPorID(@PathVariable Integer id) {
        return torcedorService.consultaPorID(id);
    }

    @GetMapping(path = "/lista")
    public List<?> consultarTodos() {
        return torcedorService.consultarTodos();
    }

    @PostMapping
    public ResponseEntity<TorcedorResponse> salvar(@RequestBody @Valid TorcedorModel torcedorModel) {
        return torcedorService.salvar(torcedorModel);
    }

    @DeleteMapping
    public ResponseEntity<?> deletar(@RequestParam Integer id) {
        return torcedorService.delete(id);
    }

    @PutMapping
    public ResponseEntity<?> put(@RequestParam @Valid TorcedorModel torcedorModel) {
        // return torcedorService.put(torcedorModel);
        return null;
    }
}
/*
    }
    @PostMapping
    public ResponseEntity<?> atualizar(@RequestParam("cpf") String cpf, @RequestBody @Valid ClienteModelDto cliente) {
        return clienteService.atualizar(cpf,cliente);
    }
    @GetMapping
    public ResponseEntity<?> atualizar(@RequestParam("cpf") String cpf, @RequestBody @Valid ClienteModelDto cliente) {
        return clienteService.atualizar(cpf,cliente);
    }
}

 */
