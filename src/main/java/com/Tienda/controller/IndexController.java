package com.Tienda.controller;

import com.Tienda.dao.ClienteDao;
import com.Tienda.domain.Cliente;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author manul
 */
@Slf4j
@Controller
public class IndexController {

    @Autowired
    ClienteDao clienteDao;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("ahora utilizando MVC");
//        String mensaje = "Estamos en semana 4, saludos!";
//        model.addAttribute("MensajeSaludo", mensaje);
//        
//        Cliente cliente = new Cliente("Jonathan", "Brenes Blanco", "jbrenesbl@gmail.com", "88447");
//        Cliente cliente2 = new Cliente("Francisco", "Montero Ramirez", "fmontero@gmail.com", "88323");       
//        //model.addAttribute("cliente", cliente);
//        List<Cliente> clientes = Arrays.asList(cliente,cliente2);
//        model.addAttribute("clientes", clientes);

        var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        return "index";
    }

}
