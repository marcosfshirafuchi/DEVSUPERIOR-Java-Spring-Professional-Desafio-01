package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Registrando um componente
@Service
public class OrderService {
    /**
     * <h1> DEVSUPERIOR - Java Spring Professional - Capítulo: Componentes e injeção de dependência</h1>
     * DESAFIO: Componentes e injeção de dependência
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   02/07/2024
     */

    //Autowired cria o construtor
    @Autowired
    private ShippingService shippingService;


    public double total(Order order){
        double total = order.getBasic() -(order.getBasic()*(order.getDiscount())/100)  + shippingService.shipment(order);
        return total;
    }

}
