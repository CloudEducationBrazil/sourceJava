package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class EnumeracoesComposicoes {

	public static void main(String[] args) {
		// https://github.com/acenelio/enum1-java
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);

		OrderStatus osd1 = OrderStatus.DELIVERED;
		OrderStatus osd2 = OrderStatus.valueOf("DELIVERED"); // Informado pelo usuário por exemplo

		System.out.println(osd1);
		System.out.println(osd2);
	}
}
