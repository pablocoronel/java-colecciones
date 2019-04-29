import java.util.Comparator;
import java.util.TreeSet;

public class Prueba_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String implementa la interface Comparable por defecto, por eso lo orden
		// automaticamente el TreeSet
//		TreeSet<String> ordena_personas = new TreeSet<String>();
//
//		ordena_personas.add("Sandra");
//		ordena_personas.add("Mariana");
//		ordena_personas.add("Lorena");
//
//		for (String p : ordena_personas) {
//			System.out.println(p);
//		}

		Articulo primero = new Articulo(1, "Primer articulo");
		Articulo segundo = new Articulo(2, "Segundo articulo");
		Articulo tercero = new Articulo(3, "Tercer articulo");
		Articulo cuarto = new Articulo(4, "Cuarto articulo");

		TreeSet<Articulo> ordena_articulos = new TreeSet<Articulo>();
		ordena_articulos.add(primero);
		ordena_articulos.add(tercero);
		ordena_articulos.add(cuarto);
		ordena_articulos.add(segundo);

		for (Articulo articulo : ordena_articulos) {
			System.out.println(articulo.getDescripcion());
		}

		/*********************************************************/
		// con Comparator
		// version de Articulo con comparator
		// Articulo comparador_articulos = new Articulo();

		// TreeSet que recibe un Comparator
		// el TreeSet busca directamente el metodo compare()
		// TreeSet<Articulo> ordena_articulos_2 = new
		// TreeSet<Articulo>(comparador_articulos);

//		ordena_articulos_2.add(primero);
//		ordena_articulos_2.add(segundo);
//		ordena_articulos_2.add(tercero);
//		ordena_articulos_2.add(cuarto);
//
//		// ver
//		System.out.println();
//		for (Articulo art : ordena_articulos_2) {
//			System.out.println(art.getDescripcion());
//		}

		/********************************************************************/
		// comparar sin implementar interfaces en la clase
		/*********************************************************************/

		// comparador
		Comparador_Articulos compara_art = new Comparador_Articulos();

		// coleccion
		TreeSet<Articulo> ordena_articulos_3 = new TreeSet<>(compara_art);

		ordena_articulos_3.add(primero);
		ordena_articulos_3.add(segundo);
		ordena_articulos_3.add(tercero);
		ordena_articulos_3.add(cuarto);

		// ver
		System.out.println("3");
		for (Articulo art : ordena_articulos_3) {
			System.out.println(art.getDescripcion());
		}

		/****************************************************/
		// comparar con clase interna
		/*******************************************************/
		TreeSet<Articulo> ordena_articulos_4 = new TreeSet<>(new Comparator<Articulo>() {

			@Override
			public int compare(Articulo o1, Articulo o2) {
				// TODO Auto-generated method stub
				String descripcionA = o1.getDescripcion();
				String descripcionB = o2.getDescripcion();

				return descripcionA.compareTo(descripcionB);
			}

		});

		ordena_articulos_4.add(primero);
		ordena_articulos_4.add(segundo);
		ordena_articulos_4.add(tercero);
		ordena_articulos_4.add(cuarto);

		// ver
		System.out.println("4");
		for (Articulo art : ordena_articulos_4) {
			System.out.println(art.getDescripcion());
		}
	}

}

// para Comparable y Comparator
//class Articulo implements Comparable<Articulo>, Comparator<Articulo> {
class Articulo implements Comparable<Articulo> {
	private int numero;
	private String descripcion;

//	public Articulo() {
//
//	}

	public Articulo(int numero, String descripcion) {
		// TODO Auto-generated constructor stub
		this.numero = numero;
		this.descripcion = descripcion;
	}

	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		int resultado = 0;

		if (this.numero < o.numero) {
			resultado = -1;
		} else if (this.numero > o.numero) {
			resultado = 1;
		}

		return resultado;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

//	@Override
//	public int compare(Articulo arg0, Articulo arg1) {
//		// TODO Auto-generated method stub
//
//		String descripcionA = arg0.getDescripcion();
//		String descripcionB = arg1.getDescripcion();
//
//		return descripcionA.compareTo(descripcionB);
//	}
}

class Comparador_Articulos implements Comparator<Articulo> {

	@Override
	public int compare(Articulo o1, Articulo o2) {
		// TODO Auto-generated method stub
		String descripcionA = o1.getDescripcion();
		String descripcionB = o2.getDescripcion();

		return descripcionA.compareTo(descripcionB);
	}

}