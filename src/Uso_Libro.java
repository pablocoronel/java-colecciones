
public class Uso_Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro_1 = new Libro("Programación en Java", "Pablo", 25);
		Libro libro_2 = new Libro("Programación en Java", "Pablo", 25);

		// sin sobreescribir los metodos equals() y hashCode() para la clase Libro, como
		// no es una clase predefinida, se consideran objetos distintos

		// una vez que la clase Libro tiene sobreescrito el metodo equals(), ya se
		// pueden comparar
		if (libro_1.equals(libro_2)) {
			System.out.println("Es el mismo libro");

			System.out.println(libro_1.hashCode());
			System.out.println(libro_2.hashCode());
		} else {
			System.out.println("No es el mismo libro");

			System.out.println(libro_1.hashCode());
			System.out.println(libro_2.hashCode());
		}
	}

}
