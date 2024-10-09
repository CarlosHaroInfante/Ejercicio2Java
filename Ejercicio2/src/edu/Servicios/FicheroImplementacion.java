package edu.Servicios;

import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FicheroImplementacion implements FicheroInterfaz{

	public void ficheroLog(String mensaje) {
		try {
			
		
		LocalDate fechaHoy = LocalDate.now();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("ddMMyyyy");
		
		String fechaDeHoy = formato.format(fechaHoy);
		
		String ficheroLog = "C:\\Users\\Carlos\\Desktop\\CSI2\\DonRegino Java\\PruebaJava-main\\Ejercicio2\\src\\edu\\Servicios\\" + fechaDeHoy + ".txt";
		
		FileWriter escribe = new FileWriter(ficheroLog, true);
		
		escribe.write(mensaje + "\n");
		escribe.close();
 		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al crear/escribir fichero log" + e.getMessage());
		}
	}
}
