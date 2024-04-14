package main;

import java.time.LocalDate;
import productos.*;
//import gestion.*;



public class Main {

	public static void main(String[] args) {
		Bebida cocacola = new Bebida("Cocacola", 2.3f, LocalDate.of(2027, 4, 15), "", true, false, "220");
		Comida manzana = new Comida("Manzana", 1.2f, LocalDate.of(2024, 4, 15), "", true, 2.0f, true, LocalDate.of(2024, 4, 8));


		cocacola.detalle_producto();

		manzana.detalle_producto();
		
		

	}

}
