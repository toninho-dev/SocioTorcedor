package com.everis.socioTorecedor.Socio_Torcedor.service;

import com.everis.socioTorecedor.Socio_Torcedor.Model.TorcedorModel;
import com.everis.socioTorecedor.Socio_Torcedor.Model.TorcedorModel;
import com.everis.socioTorecedor.Socio_Torcedor.Repository.TorcedorRepository;
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
    public ResponseEntity<?> salvar(TorcedorModel torcedorModel) {
//        Optional<TorcedorModel> findId = repository.findById(torcedorModel.getId());
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(torcedorModel));
    }

//    public ResponseEntity<?> delete(String cpf) {
//        Optional<ClienteModel> cliente = repository.findByCpf(cpf);
//        List<ContaModel> contas = repositoryConta.findAllByCpf(cpf);
//        ExceptionJson exceptionJson = new ExceptionImpl();
//        if (contas.isEmpty()) {
//            if (exceptionJson.clienteExiste(repository, cpf)) {
//                repository.delete(cliente.get());
//                return exceptionJson.deleteClienteEfetuado(cliente.get().getId(), cliente.get().getNome(), cliente.get().getCpf());
//            } else {
//                return exceptionJson.clienteNEncontrada(cpf);
//            }
//        }
//        return exceptionJson.contasPresente(repositoryConta, cpf);
//    }
//
//
//    public ResponseEntity<?> atualizar(String cpf, ClienteModelDto cliente) {
//        Optional<ClienteModel> busca = repository.findByCpf(cpf);
//        if (busca.isPresent()) {
//            ClienteModel clienteModel = cliente.atualizar(cpf, repository);
//            return ResponseEntity.ok(new ClienteModelDto(clienteModel));
//        }
//        ExceptionJson exceptionJson = new ExceptionImpl();
//        return exceptionJson.clienteNEncontrada(cpf);
//    }

}