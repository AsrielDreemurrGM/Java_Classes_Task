/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 */

package br.com.eaugusto;

/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 06/05/2025
 * @version 1.0
* {@summary Public seller class. Here products are instantiated and "sold".}
 */

public class Seller {
	public static void main(String[] args) {
		
		TV samsung = new TV();
		
		samsung.setBrand("Samsung");
		samsung.setDisplaySize(43);
		samsung.setModel("QE43Q60DA");
		samsung.setName("Samsung 4K QLED TV");
		samsung.setIsSmart(true);
		
		System.out.println("Product Information:");
		System.out.println("-------------------------------");
		System.out.println("Name: " + samsung.getName());
		System.out.println("Brand: " + samsung.getBrand());
		System.out.println("Model: " + samsung.getModel());
		System.out.println("Display Size: " + samsung.getDisplaySize() + " inches");
		System.out.println("Is a Smart TV: " + samsung.getIsSmart());
		System.out.println("-------------------------------");
		System.out.println("Product Actions:");
		System.out.println(samsung.toggleOnOff());
		System.out.println(samsung.toggleOnOff());
		System.out.println("-------------------------------");
	}
}
