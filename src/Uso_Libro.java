
public class Uso_Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro_1 = new Libro("Programación en Java", "Pablo", 25);
		Libro libro_2 = new Libro("Programación en Java", "Pablo", 25);

		// sin sobreescribir los metodos equals() y hashCode() para la clase Libro, como
		// no es una clase predefinida, se consideran objetos distintos
		if (libro_1.equals(libro_2)) {
			System.out.println("Es el mismo libro");
		} else {
			System.out.println("No es el mismo libro");
		}
	}

}
