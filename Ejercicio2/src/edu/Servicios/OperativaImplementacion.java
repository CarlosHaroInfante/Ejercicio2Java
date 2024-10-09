package edu.Servicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import edu.Dtos.pedidosDto;
import edu.Dtos.ventasDto;

public class OperativaImplementacion implements OperativaInterfaz{

	Scanner sc = new Scanner(System.in);
	public void aniadirVentas(List<ventasDto> listaVentas) {
		
		
		String otraVez = "S";
		while(otraVez.equals("S")) {
		
		
		ventasDto ventaNueva = new ventasDto();
		
		System.out.println("Importe de la venta");
		ventaNueva.setImporteVenta(sc.nextDouble());
		
		LocalDateTime fechaMomentoVenta = LocalDateTime.now();
		ventaNueva.setIntanteDeVenta(fechaMomentoVenta);
		
		ventaNueva.setIdVenta(idAuto(listaVentas));
		
		listaVentas.add(ventaNueva);
		
		System.out.println("¿Quieres añadir otra venta [S] para sí o [N] para no?");
		otraVez = sc.next();
		}
		
	}
	public void calculoVentasDiario(List<ventasDto> listaVentas) {
		
		System.out.println("Dime la fecha del dia en formato dd/MM/yyyy");
		String fechaEntrega = sc.next();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaFormateada = LocalDate.parse(fechaEntrega, formato);
		
		Double total = 0.0;
		
		for (ventasDto ventas : listaVentas) {
			if(ventas.getIntanteDeVenta().getDayOfMonth() == fechaFormateada.getDayOfMonth() &&
			ventas.getIntanteDeVenta().getMonthValue() == fechaFormateada.getMonthValue() &&
			ventas.getIntanteDeVenta().getYear() == fechaFormateada.getYear())
			{
				total = total + ventas.getImporteVenta(); 
				System.out.println(total);
			}
			
		}
		
	}
	
	public void MostrarVentas(List<ventasDto> listaVentas) {
		System.out.println("Dime la fecha del dia en formato dd/MM/yyyy");
		String fechaHoy = sc.next();
		
		for (ventasDto ventas : listaVentas) {
			if(ventas.getFechaVenta().equals(fechaHoy)) {
				System.out.println("Venta Número: " + ventas.getIdVenta() + "\n"
						+ "Euros: " + ventas.getImporteVenta() + "\n"
						+ "Instante de compra: " + ventas.getIntanteDeVenta().getDayOfMonth() + "-" + ventas.getIntanteDeVenta().getMonthValue() + "-" + ventas.getIntanteDeVenta().getYear() +
						" " + ventas.getIntanteDeVenta().getHour() + ":" + ventas.getIntanteDeVenta().getMinute() + ":" + ventas.getIntanteDeVenta().getSecond());
				
			}
			
		}
		
	}
	
	public void pedidoProveedores(List<pedidosDto> listapedidos) {
		String otraVez = "S";
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		while(otraVez.equals("S")) {
		
		
		pedidosDto pedidoNuevo = new pedidosDto();
		System.out.println("Nombre del producto");
		pedidoNuevo.setNombre(sc.next());
		
		System.out.println("Cantidad del producto");
		pedidoNuevo.setCantidadProducto(sc.nextInt());
		
		System.out.println("Fecha de entrega deseada (dd-MM-yyyy)");
		String fechaEntrega = sc.next();
		
		LocalDate fechaFormateada = LocalDate.parse(fechaEntrega, formato);
		pedidoNuevo.setFechaDeseaDate(fechaFormateada);
		
		pedidoNuevo.setId(idAuto1(listapedidos));
		
		
		listapedidos.add(pedidoNuevo);
		
		
		
		
		System.out.println("¿Quieres añadir otra venta [S] para sí o [N] para no?");
		otraVez = sc.next();
		
		for (pedidosDto pedidos : listapedidos) {
			
			System.out.println("Producto: " + pedidos.getNombre() + "\n" + "Cantidad: " + pedidos.getCantidadProducto() +  "\n" + "Fecha  entrega Deseada:" + pedidos.getFechaDeseaDate());
		}
		}
	}
	
	
	private long idAuto(List<ventasDto> listaVentas) {
		
		long idAutogenerado = 0;
		int tamanioLista = listaVentas.size();
		
		
		if(tamanioLista > 0) {
			idAutogenerado = listaVentas.get(tamanioLista - 1).getIdVenta() + 1;
		}
		else {
			idAutogenerado = 1;
		}
		return idAutogenerado;
	}
	
	private long idAuto1(List<pedidosDto> listaPedidos) {
			
			long idAutogenerado = 0;
			int tamanioLista = listaPedidos.size();
			
			
			if(tamanioLista > 0) {
				idAutogenerado = listaPedidos.get(tamanioLista - 1).getId() + 1;
			}
			else {
				idAutogenerado = 1;
			}
			return idAutogenerado;
		}
	
}
