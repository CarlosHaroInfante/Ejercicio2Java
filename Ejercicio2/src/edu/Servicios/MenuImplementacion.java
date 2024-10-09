package edu.Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{
	
	Scanner sc = new Scanner(System.in);
	public byte menuPrincipal(){
		
		System.out.println("Menú Principal");
		System.out.println("--------------");
		System.out.println("[0] - Cerrar Menú");
		System.out.println("[1] - Menú Empleado");
		System.out.println("[2] - Menú Gerente");
		
		byte opcion = sc.nextByte();
		
		return opcion;
		
	}
	
	public byte menuEmpleado(){
			
			System.out.println("Menú Empleado");
			System.out.println("--------------");
			System.out.println("[0] - Volver");
			System.out.println("[1] - Cálculo total de ventas diario");
			System.out.println("[2] - Añadir venta");
			
			byte opcionEmpleado = sc.nextByte();
			
			return opcionEmpleado;
			
		}
	public byte menuGerente(){
		
		System.out.println("Menú Gerente");
		System.out.println("--------------");
		System.out.println("[0] - Volver");
		System.out.println("[1] - Mostrar todas las ventas del día");
		System.out.println("[2] - Crear un nuevo pedido para proveedores");
		
		byte opcionEmpleado = sc.nextByte();
		
		return opcionEmpleado;
		
	}
}
