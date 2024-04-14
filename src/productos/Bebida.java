package productos;


import java.time.LocalDate;

public class Bebida extends Producto {
	// Atributos
	private boolean gaseoso;
	private boolean lacteo;
	private String medida;

	// Constructor
	public Bebida(String nombre, float precio, LocalDate fecha_caducidad, String estado,boolean gaseoso, boolean lacteo, String medida) {
		super(nombre, precio, fecha_caducidad, estado);
		this.gaseoso = gaseoso;
		this.lacteo = lacteo;
		this.medida = medida;
	}
	
	public String gaseoso() {
		if (gaseoso) {
			String gas;
			return gas = "Si";
		}else {
			String gas;
			return gas = "No";
		}
	}
	
	public String medida() {
		return medida;
	}
	
	public String lacteo() {
		if (lacteo) {
			String lacteo;
			return lacteo = "Si";
		}else {
			String lacteo;
			return lacteo = "No";
		}
	}
	
	@Override
	public LocalDate obtener_caducidad() {

		if (lacteo) {
			return fecha_caducidad.plusDays(10) ;
		} else {
			return fecha_caducidad.plusDays(20);
		}
	}

	@Override
	public String verificarOferta() {
		return super.verificarOferta();
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
			System.out.println("   \uD83C\uDF7A Detalles del producto \uD83C\uDF7A \n"
					+ " |═════════════════════════════|\n"
					+ " - Nombre:     " + nombre + "                     |\n"
					+ " - Precio:     " + descuento() + "\n"
					+ " - Caducidad:  " + obtener_caducidad() + "\n"
					+ " - Estado:     " + estado + "\n"
					+ " - Gaseoso:    " + gaseoso() + "\n"
					+ " - Lácteo:     " + lacteo() + "\n"
					+ " - Medida:     " + medida() + "cc" + "\n"
					+ " - Oferta: " + verificarOferta());
			System.out.println(lineaInferior);
		}else {
			System.out.println(lineaSuperior);
			System.out.println(" \u26D4 Producto " + nombre + " CADUCADO \u26D4");
			System.out.println(lineaInferior);
		}
	}
	public static void main(String[] args) {
		Bebida cocacola = new Bebida("Cocacola", 2.3f, LocalDate.of(2027, 4, 15), "", true, false, "220");
	}

}