package productos;

//import java.util.Scanner;
import java.time.LocalDate;


public abstract class Producto {

	// Atributos
	protected String nombre;
	protected float precio;
	protected LocalDate fecha_caducidad;
	protected String estado;
	protected boolean verEstado;


	// Constructor
	public Producto(String nombre, float precio,LocalDate fecha_caducidad,String estado) {
		this.nombre = nombre;
		this.precio = precio;
		this.fecha_caducidad = fecha_caducidad;
		this.estado = "COMESTIBLE";
	}

	// Métodos abstractos
	public abstract LocalDate obtener_caducidad();
	public abstract void detalle_producto();

	public float descuento() {
		LocalDate fechaActual = LocalDate.now();

		// Calcular la diferencia en días entre la fecha actual y la fecha de caducidad
		long diferenciaDias = fecha_caducidad.toEpochDay() - fechaActual.toEpochDay();

		if (diferenciaDias <= 5) {
			// Calcular el descuento del 30% si hay oferta
			float descuento = 0.3f * precio; // Descuento del 30%
			precio -= descuento; // Aplicar el descuento al precio
		} 
		float precioRedondeado = Math.round(precio * 100.0f) / 100.0f;   
		return precioRedondeado;
	}

	public String verificarOferta() {
		LocalDate fechaActual = LocalDate.now();

		// Calcular la diferencia en días entre la fecha actual y la fecha de caducidad
		long diferenciaDias = fecha_caducidad.toEpochDay() - fechaActual.toEpochDay();

		// Verificar si faltan menos de 5 días para la caducidad (oferta)
		if (diferenciaDias <= 5) {
			String oferta;
			return oferta = "\n   ╔════════════════════════╗\n"
					      + "   |    \uD83D\uDC4F ¡HAY OFERTA! \uD83D\uDC4F  |\n"
					      + "   ╚════════════════════════╝";
		} else {
			String oferta;
			return oferta = " \u274C NO HAY OFERTA \u274C";
		}


	}
	
	public boolean muestraDatos() {
		LocalDate fechaActual = LocalDate.now();
		long diferenciaDias = fecha_caducidad.toEpochDay() - fechaActual.toEpochDay();

		if (diferenciaDias <= 0) {
			verEstado = false;
		}else {
			verEstado = true;
		} 
		return verEstado;

	}
	
	public String verificarEstado() {
		LocalDate fechaActual = LocalDate.now();

		// Calcular la diferencia en días entre la fecha actual y la fecha de caducidad
		long diferenciaDias = fecha_caducidad.toEpochDay() - fechaActual.toEpochDay();

		if (diferenciaDias <= 0) {
			estado = "¡CADUCADO!";
		}
		return estado;

	}



}
