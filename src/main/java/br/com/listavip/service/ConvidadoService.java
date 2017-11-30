package br.com.listavip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.listavip.model.Convidado;
import br.com.listavip.repository.ConvidadoRepository;

/**
 * Created by richard on 26/11/17.
 */
@Service
public class ConvidadoService {

    @Autowired
    private ConvidadoRepository repository;

    public Iterable<Convidado> obterTodos(){
        Iterable<Convidado> convidados = repository.findAll();
        return convidados;
    }

    public void salvar(Convidado convidado){
        repository.save(convidado);
    }

    public void findByName(String name){
     //   repository.findByName(name);
    }
}