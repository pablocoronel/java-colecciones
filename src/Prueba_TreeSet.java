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
	}

}

class Articulo implements Comparable<Articulo> {
	private int numero;
	private String descripcion;

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
}