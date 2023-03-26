package com.Tienda.service;

import com.Tienda.dao.ClienteDao;
import com.Tienda.dao.CreditoDao;
import com.Tienda.domain.Cliente;
import com.Tienda.domain.Credito;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author manul
 */
@Service
public class ClienteSeviceImp implements ClienteService {

    @Autowired
    ClienteDao clienteDao;
    
    @Autowired
    CreditoDao creditoDao;

    @Override
    @Transactional(readOnly = true) // para manejar transacciones de solo lectura
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        Credito credito = cliente.getCredito();
        credito = creditoDao.save(credito);
        cliente.setCredito(credito);
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.deleteById(cliente.getIdCliente());
    }

    @Override
    public List<Cliente> getClienteCorreo(String correo) {
        return (List<Cliente>) clienteDao.findByCorreo(correo);
    }

    @Override
    public List<Cliente> getClienteNombreApellidos(String nombre, String apellidos) {
        return (List<Cliente>) clienteDao.findByNombreOrApellidos(nombre, apellidos);
    }

    @Override
    public List<Cliente> getClienteNombre(String nombre) {
         return (List<Cliente>) clienteDao.findByNombre(nombre);
    }

}
