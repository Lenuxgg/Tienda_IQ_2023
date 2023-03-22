package com.Tienda.dao;

import com.Tienda.domain.Articulo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author manul
 */
public interface ArticuloDao extends CrudRepository<Articulo, Long>{
    
}
