
package com.Tienda.service;

import com.Tienda.dao.ClienteDao;
import com.Tienda.domain.Cliente;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author manul
 */
@Service
public class ClienteSeviceImp implements ClienteService{
    
    @Autowired
    ClienteDao clienteDao;
    
    @Override
    @Transactional(readOnly = true) // para manejar transacciones de solo lectura
    public List<Cliente> getClientes(){
        return (List<Cliente>)clienteDao.findAll();
    }


    @Override
    @Transactional
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.deleteById(cliente.getIdCliente());
    }
    
}
