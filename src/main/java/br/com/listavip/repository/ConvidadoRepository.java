package br.com.listavip.repository;


import br.com.listavip.model.Convidado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by richard on 25/11/17.
 */
@Repository
public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {
}
