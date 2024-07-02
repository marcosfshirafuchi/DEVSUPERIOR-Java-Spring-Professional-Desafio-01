package com.devsuperior;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class JavaSpringProfessionalDesafio01Application implements CommandLineRunner {
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
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringProfessionalDesafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int code = scanner.nextInt();
		double basic = scanner.nextDouble();
		double discount = scanner.nextDouble();
		Order order = new Order(code,basic,discount);
		System.out.println("Pedido código " + code);
		System.out.println("Valor total: R$ " +String.format("%.2f",orderService.total(order)));
		scanner.close();
	}
}
