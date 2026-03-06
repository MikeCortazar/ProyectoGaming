package Main;

import java.util.Scanner;

import Dominio.VideoJuegos;
import Implementacion.LogicaMetodos;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = null;

		LogicaMetodos imp = new LogicaMetodos();

		String nombre;
		char clasificacion;
		float precio;
		int stock, menuPrin;

		VideoJuegos game;

		do {
			System.out.println("Menu");
			System.out.println("1. Alta");
			System.out.println("2. Mostrar");
			System.out.println("3. Buscar");
			System.out.println("4. Editar");
			System.out.println("5. Eliminar");
			System.out.println("6. Salir");

			sc = new Scanner(System.in);
			menuPrin = sc.nextInt();

			switch (menuPrin) {
			case 1:
				try {
					System.out.println("Ingrese el nombre ");
					sc = new Scanner(System.in);
					nombre = sc.nextLine();

					System.out.println("Ingrese la Clasificacion");
					sc = new Scanner(System.in);
					clasificacion = sc.next().charAt(0);

					System.out.println("Ingrese el precio");
					sc = new Scanner(System.in);
					precio = sc.nextFloat();

					System.out.println("Ingrese el stock");
					sc = new Scanner(System.in);
					stock = sc.nextInt();

					game = new VideoJuegos(nombre, clasificacion, precio, stock);

					imp.guardar(game);
					System.out.println("Se guardo");
				} catch (Exception e) {
					System.out.println("Error al guardar " + e.getMessage());
				}

				break;

			case 2:
				if (imp.contarRegHM() > 0) {
					imp.mostrar();

					break;
				} else
					System.out.println("No hay registros para mostrar.");
				break;

			case 3:
				if (imp.contarRegHM() > 0) {
					System.out.println("Ingrese el nombre del juego a buscar");
					sc = new Scanner(System.in);
					nombre = sc.nextLine();

					game = imp.buscar(nombre);
					if (game != null) {
						System.out.println(game);
						break;
					} else
						System.out.println("No existe ese juego");

					
				} else
					System.out.println("No hay registros para buscar");
				break;

			case 4:
				if(imp.contarRegHM()>0) {
					System.out.println("Ingrese el nombre del registro a editar");;
					sc = new Scanner(System.in);
					nombre = sc.nextLine();
					
					game = imp.buscar(nombre);
					if(game != null);
					System.out.println("Se encontro " +game.getTiulo());
					
					System.out.println("Ingrese el precio de oferta");
					sc = new Scanner (System.in);
					precio = sc.nextFloat();
					
					game.setPrecio(precio);
					
					imp.editar(game);
					System.out.println("Se edito");
					
				}else 
					System.out.println("No hay registros para buscar");

				break;

			case 5:
				System.out.println("Ingresa el nombre del registro a eliminar");
				sc = new Scanner(System.in);
				nombre = sc.nextLine();
				
				imp.eliminar(nombre);
				System.out.println("Se elimino");
				
				break;

			case 6:
				break;
			}

		} while (menuPrin < 6);

	}
}
