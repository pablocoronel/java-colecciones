import java.util.LinkedList;
import java.util.ListIterator;

public class Prueba_Lista_Enlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> paises = new LinkedList<String>();

		paises.add("España");
		paises.add("Colombia");
		paises.add("México");
		paises.add("Perú");

		LinkedList<String> capitales = new LinkedList<String>();

		capitales.add("Madrid");
		capitales.add("Bogotá");
		capitales.add("DF");
		capitales.add("Lima");

//		System.out.println(paises);
//		System.out.println(capitales);

		// recorrer las listas para agregar capitales despues de cada pais
		ListIterator<String> it_paises = paises.listIterator();
		ListIterator<String> it_capitales = capitales.listIterator();

		while (it_capitales.hasNext()) {
			if (it_paises.hasNext()) {
				/// avanza una posicion los paises
				it_paises.next();
			}

			// se pone un capital despues de avanzar un pais
			// usando el iterador para tener la posicion
			it_paises.add(it_capitales.next());
		}

		System.out.println(paises);

		/******************************************************/
		// en capitales, eliminar los elementos pares
		it_capitales = capitales.listIterator();

		while (it_capitales.hasNext()) {
			int index = it_capitales.nextIndex();
			it_capitales.next();

			if ((index % 2) == 0) {
				if (it_capitales.hasNext()) {
					it_capitales.next();
				}
				
				it_capitales.remove();
			}
		}

		System.out.println(capitales);
		
		/***********************************************/
		// quitar de los paises, las capitales que quedan (Madrid y DF)
		paises.removeAll(capitales);
		System.out.println(paises);
	}

}
