package edu.Controladores;

import java.io.IOError;
import java.util.ArrayList;
import java.util.List;

import edu.Dtos.pedidosDto;
import edu.Dtos.ventasDto;
import edu.Servicios.FicheroImplementacion;
import edu.Servicios.FicheroInterfaz;
import edu.Servicios.MenuImplementacion;
import edu.Servicios.MenuInterfaz;
import edu.Servicios.OperativaImplementacion;
import edu.Servicios.OperativaInterfaz;

public class Inicio {

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<ventasDto> listaVentas = new ArrayList<ventasDto>();
	    List<pedidosDto> listaPedidos = new ArrayList<pedidosDto>();
		MenuInterfaz menuPrincipal = new MenuImplementacion();
		FicheroInterfaz fichero = new FicheroImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		Boolean cerrarMenu = false;
		String mensaje;
		try {
			
		
		while (!cerrarMenu) {
			byte opcionMenuPrincipal = menuPrincipal.menuPrincipal();
			mensaje = "Se abre el menú principal";
			fichero.ficheroLog(mensaje);
			switch (opcionMenuPrincipal) {
			case 0: {
				System.out.println("Cerrar Menú");
				mensaje = "Se cierra el menú principal";
				fichero.ficheroLog(mensaje);
				cerrarMenu = true;
				break;
			}
			case 1:{
				System.out.println("Menú Empleado");
				byte opcionMenuEmpleado = menuPrincipal.menuEmpleado();
				mensaje = "Se abre el menú empleado";
				fichero.ficheroLog(mensaje);
				switch (opcionMenuEmpleado) {
					case 0: {
						mensaje = "Vuelve al menú principal";
						menuPrincipal.menuPrincipal();
						fichero.ficheroLog(mensaje);
						break;
					}
					case 1: {
						System.out.println("Cálculo total de ventas diario");
						mensaje = "Se calcula el total de ventas diario";
						oi.calculoVentasDiario(listaVentas);
						fichero.ficheroLog(mensaje);
						break;
						
					}
					case 2: {
						System.out.println("Añadir venta");
						mensaje = "Se añade una venta";
						fichero.ficheroLog(mensaje);
						oi.aniadirVentas(listaVentas);
						for (ventasDto ventas : listaVentas) {
							System.out.println(ventas.toString());
						}
						break;
					}
					default:
						mensaje = "Se ha dado a una opción no válida, vuelve a intentarlo";
						fichero.ficheroLog(mensaje);
						break;
					}
				break;
			}
			case 2:{
				byte opcionMenuGerente = menuPrincipal.menuGerente();
				mensaje = "Entra en el menu Gerente";
				fichero.ficheroLog(mensaje);
				switch (opcionMenuGerente) {
					case 0: {
						mensaje = "Vuelve al menú principal";
						menuPrincipal.menuPrincipal();
						fichero.ficheroLog(mensaje);
						break;
						
					}
					case 1: {
						System.out.println("Mostrar todas las ventas del día");
						mensaje = "Se muestra todas las ventas del día";
						fichero.ficheroLog(mensaje);
						oi.MostrarVentas(listaVentas);
						break;
						
					}
					case 2: {
						System.out.println("Crear un nuevo pedido para proveedores.");
						mensaje = "Se crea un nuevo pedido para proveedores";
						fichero.ficheroLog(mensaje);
						oi.pedidoProveedores(listaPedidos);
						break;
					}
					default:
						mensaje = "Se ha dado a una opción no válida, vuelve a intentarlo";
						fichero.ficheroLog(mensaje);
						break;
					}
				break;
			}
				
			default: {
				mensaje = "Se ha dado a una opción no válida, vuelve a intentarlo";
				fichero.ficheroLog(mensaje);
				break;
			
			}
			
	
			}
		}
		} 
		catch (Exception e) {
				// TODO: handle exception
			System.out.println("Error tipo I/O en el menú del programa " + e.getMessage());
			}
	}
}
		
