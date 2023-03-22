package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author manul
 */
public interface CategoriaService {

    public List<Categoria> getCategorias(boolean activos);

    public Categoria getCategoria(Categoria categoria);

    public void save(Categoria categoria);

    public void delete(Categoria categoria);
}
