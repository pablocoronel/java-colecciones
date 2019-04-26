import java.util.LinkedList;
import java.util.ListIterator;

public class Prueba_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> personas = new LinkedList<String>();

		personas.add("pepe");
		personas.add("sandra");
		personas.add("ana");
		personas.add("laura");

		System.out.println(personas.size());

		// iterador para LinkedList
		ListIterator<String> it = personas.listIterator();

		// agregar un elemento (se usa el iterador para indicar la posicion)
		
		for (String persona : personas) {
			System.out.println(persona);
		}
	}

}
