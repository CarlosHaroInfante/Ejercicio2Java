package edu.Dtos;

import java.time.LocalDate;

public class pedidosDto {

	long id;
	
	String nombre = "aaaaa";
	
	int cantidadProducto = 0;
	
	LocalDate fechaDeseaDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public LocalDate getFechaDeseaDate() {
		return fechaDeseaDate;
	}

	public void setFechaDeseaDate(LocalDate fechaDeseaDate) {
		this.fechaDeseaDate = fechaDeseaDate;
	}

	public pedidosDto(long id, String nombre, int cantidadProducto, LocalDate fechaDeseaDate) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidadProducto = cantidadProducto;
		this.fechaDeseaDate = fechaDeseaDate;
	}

	public pedidosDto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "pedidosDto [id=" + id + ", nombre=" + nombre + ", cantidadProducto=" + cantidadProducto
				+ ", fechaDeseaDate=" + fechaDeseaDate + "]";
	}

	
}
