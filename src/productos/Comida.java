package productos;

import java.util.Scanner;

//import main.Bebida;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Comida extends Producto{
	// Atributos
	private boolean perecedero;
	private float calorias;
	private boolean vegano;
	private LocalDate fecha_envase;

	// Constructor
	public Comida(String nombre, float precio, LocalDate fecha_caducidad, String estado, boolean perecederos, float calorias, boolean vegano, LocalDate fecha_envase) {
		super(nombre, precio, fecha_caducidad, estado);
		this.perecedero = perecederos;
		this.calorias = calorias;
		this.vegano = vegano;
		this.fecha_envase = fecha_envase;
	}
	public String vegano() {

		if (vegano) {
			String vegan;
			return vegan = "Si";
		}else {
			String vegan;
			return vegan = "No";
		}

	}
	public String perecedero() {

		if (perecedero) {
			String perec;
			return perec = "Si";
		}else {
			String perec;
			return perec = "No";
		}

	}
	// Implementación de métodos abstractos
	@Override
	public LocalDate obtener_caducidad() {
		if (perecedero) {
			return fecha_envase.plusDays(10) ;
		} else {
			return fecha_caducidad;
		}
	}

	@Override
	public void detalle_producto() {
		String lineaSuperior = "╔══════════════════════════════╗";
		String lineaInferior = "╚══════════════════════════════╝";
		this.nombre = nombre;
		this.precio = precio;
		this.fecha_caducidad = fecha_caducidad;
		this.estado = estado;
		muestraDatos();
		if (verEstado) {
			System.out.println(lineaSuperior);
			System.out.println("   \uD83C\uDF4C " + "Detalles del producto \uD83C\uDF4C  \n"
					+ "|══════════════════════════════|\n"
					+ " - Nombre:       " + nombre + "\n"
					+ " - Precio:       " + descuento() + "\n"
					+ " - Caducidad:    " + obtener_caducidad() + "\n"
					+ " - Estado:       " + verificarEstado() + "\n"
					+ " - Perecedero:   " + perecedero() + "\n"
					+ " - Calorías:     " + calorias + "\n"
					+ " - Vegano:       " + vegano() + "\n"
					+ " - Fecha envase: " + fecha_envase + "\n"
					+ " - Oferta: " + verificarOferta());
			System.out.println(lineaInferior);
		}else {
			System.out.println(lineaSuperior);
			System.out.println(" Producto: " + nombre);
			System.out.println("         \u26D4 CADUCADO \u26D4");
			System.out.println(lineaInferior);
		}


	}
	@Override
	public String verificarOferta() {
		return super.verificarOferta();
	}

	@Override
	public String verificarEstado() {
		return super.verificarEstado();
	}
	public static void main(String[] args) {
		Bebida cocacola = new Bebida("Cocacola", 2.3f, LocalDate.of(2027, 4, 15), "", true, false, "220");
	}

}

