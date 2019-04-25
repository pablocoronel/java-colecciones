import java.util.*;

public class Cuentas_Usuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instancias de clientes
		Cliente cliente_1 = new Cliente("cacho", "00001", 10000);
		Cliente cliente_2 = new Cliente("pedro", "00002", 15000);
		Cliente cliente_3 = new Cliente("lola", "00003", 20000);
		Cliente cliente_4 = new Cliente("nati", "00004", 25000);

		// repito un objecto
		Cliente cliente_5 = new Cliente("nati", "00004", 25000);

		// crear la coleccion
		Set<Cliente> clientes_banco = new HashSet<Cliente>();

		// agregar los elñementos a la coleccion
		clientes_banco.add(cliente_1);
		clientes_banco.add(cliente_2);
		clientes_banco.add(cliente_3);
		clientes_banco.add(cliente_4);

		// agrego el objeto repetido al hashSet (en teoria no admite repetidos)
		// aparece repetido porque para clases propias (no predefinidas), es necesrio
		// sobreescribir el metodo hashCode() y equals()
		clientes_banco.add(cliente_5);

		// recorrer la coleccion con un foreach
//		for (Cliente un_cliente : clientes_banco) {
//			System.out.println(
//					un_cliente.getNombre() + " " + un_cliente.getNumero_cuenta() + " " + un_cliente.getSaldo());
//		}

		/****************************************/
		// Eliminar elemento de una coleccion
		// en un foreach nomral lanza una excepcion, ya que no se puede modificar la
		// coleccion mientras se recorre
		// con un iterador es posible

		// el iterador contiene el objeto devuelto por el metodo iterator() de la
		// coleccion
		Iterator<Cliente> it_borrar = clientes_banco.iterator();
		while (it_borrar.hasNext()) {
			String nombre = it_borrar.next().getNombre();

			if (nombre.equals("cacho")) {
				// lo quita de la coleccion
				it_borrar.remove();
			}
		}

		// recorrer la coleccion con un iterador
		Iterator<Cliente> it = clientes_banco.iterator();

		while (it.hasNext()) {
//			String nombre_cliente = it.next().getNombre();
//			System.out.println(nombre_cliente);

			Cliente un_cliente = it.next();
			System.out.println(un_cliente.getNombre());
			System.out.println(un_cliente.getNumero_cuenta());
		}

	}

}
