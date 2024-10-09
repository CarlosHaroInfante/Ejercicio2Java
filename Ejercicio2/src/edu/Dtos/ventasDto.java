package edu.Dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class ventasDto {

	long idVenta;
	
	double importeVenta = 99.99;
	
	LocalDate fechaVenta;
	
	LocalDateTime intanteDeVenta;
	
	
	
	
	public long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(long idVenta) {
		this.idVenta = idVenta;
	}

	public double getImporteVenta() {
		return importeVenta;
	}

	public void setImporteVenta(double importeVenta) {
		this.importeVenta = importeVenta;
	}

	public LocalDateTime getIntanteDeVenta() {
		return intanteDeVenta;
	}

	public void setIntanteDeVenta(LocalDateTime intanteDeVenta) {
		this.intanteDeVenta = intanteDeVenta;
	}

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public ventasDto(long idVenta, double importeVenta, LocalDateTime intanteDeVenta, LocalDate fechaVenta) {
		super();
		this.idVenta = idVenta;
		this.importeVenta = importeVenta;
		this.intanteDeVenta = intanteDeVenta;
		this.fechaVenta = fechaVenta;
	}

	public ventasDto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ventasDto [idVenta=" + idVenta + ", importeVenta=" + importeVenta + ", intanteDeVenta=" + intanteDeVenta + ", dia de la venta="+ fechaVenta
				+ "]";
	}

	
}
