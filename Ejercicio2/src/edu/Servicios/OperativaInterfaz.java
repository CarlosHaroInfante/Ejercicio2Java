package edu.Servicios;

import java.util.List;

import edu.Dtos.pedidosDto;
import edu.Dtos.ventasDto;

public interface OperativaInterfaz {
	
	public void aniadirVentas(List<ventasDto> listaVentas);
	
	public void calculoVentasDiario(List<ventasDto> listaVentas);
	
	public void MostrarVentas(List<ventasDto> listaVentas);
	
	public void pedidoProveedores(List<pedidosDto> listapedidos);
}
