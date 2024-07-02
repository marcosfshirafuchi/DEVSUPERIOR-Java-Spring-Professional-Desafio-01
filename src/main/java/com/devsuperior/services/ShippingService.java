package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.stereotype.Service;

//Registrando um componente
@Service
public class ShippingService {
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
    public double shipment(Order order){
        if (order.getBasic()<100.00) {
            return 20.00;
        }
        else if (order.getBasic()>=100.00 && order.getBasic()<200.00) {
            return 12.00;
        }
        else{
            return 0.0;
        }
    }
}
