import java.util.HashMap;
import java.util.Map;

public class Prueba_Mapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// mapa
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();

		// agregar
		personal.put("145", new Empleado("pablo"));
		personal.put("146", new Empleado("mariana"));
		personal.put("147", new Empleado("luciano"));
		personal.put("148", new Empleado("pamela"));

		System.out.println(personal);

		// eliminar
		personal.remove("147");
		System.out.println(personal);

		// usar entrySet, devuelve un Set
		System.out.println(personal.entrySet());

		// devolver cada elemento como un Set, interface que permite usar los metodos
		// getKey() y getValue()
		for (Map.Entry<String, Empleado> cada_elemento : personal.entrySet()) {
			String clave = cada_elemento.getKey();
			Empleado valor = cada_elemento.getValue();

			System.out.println("Clave: " + clave + ", valor: " + valor);

		}
	}

}

class Empleado {
	private String nombre;
	private double sueldo;

	public Empleado(String nombre) {
		// TODO Auto-generated constructor stub

		this.nombre = nombre;
		this.sueldo = 2000;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

}