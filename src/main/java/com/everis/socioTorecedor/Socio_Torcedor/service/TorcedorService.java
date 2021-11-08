package com.everis.socioTorecedor.Socio_Torcedor.service;

import com.everis.socioTorecedor.Socio_Torcedor.Controller.response.TorcedorResponse;
import com.everis.socioTorecedor.Socio_Torcedor.Model.TorcedorModel;
import com.everis.socioTorecedor.Socio_Torcedor.Repository.TorcedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@Component
public class TorcedorService {

    @Autowired
    private TorcedorRepository repository;

    public ResponseEntity<?> consultaPorID(Integer id) {
        Optional<TorcedorModel> findId = repository.findById(id);
        return ResponseEntity.ok(findId.get());

    }

    public List<?> consultarTodos() {
        if (repository.findAll().isEmpty()) {
            List<?> lista = Arrays.asList();
            return lista;
        }
        return repository.findAll();
    }
    @Transactional
    public ResponseEntity<TorcedorResponse> salvar(TorcedorModel torcedorModel) {
        TorcedorModel teste = repository.save(torcedorModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(new TorcedorResponse(teste));
    }
    @Transactional
    public ResponseEntity<?> delete(Integer id) {
        Optional<TorcedorModel> findId = repository.findById(id);
        if (!findId.isEmpty()) {
            repository.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
    }