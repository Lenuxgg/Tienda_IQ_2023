
package com.Tienda.dao;

import com.Tienda.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author manul
 */
public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
