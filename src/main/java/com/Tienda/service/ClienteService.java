
package com.Tienda.service;

import com.Tienda.domain.Cliente;
import java.util.List;

/**
 *
 * @author manul
 */
public interface ClienteService {
    
    public List<Cliente> getClientes();
    
    public Cliente getCliente(Cliente cliente);
    
    public void save (Cliente cliente);
    
    public void delete (Cliente cliente);
    
    public List<Cliente> getClienteCorreo(String correo);
    
    public List<Cliente> getClienteNombreApellidos(String nombre, String apellidos);
    
    public List<Cliente> getClienteNombre(String nombre);

    
}
