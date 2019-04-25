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

		// agrego el objecto reperito al hashSet (en teoria no admite repetidos)
		// aparece repetido porque para clases propias (no predefinidas), es necesrio
		// sobreescribir el metodo hashCode() y equals()
		clientes_banco.add(cliente_5);

		// recorrer la coleccion
		for (Cliente un_cliente : clientes_banco) {
			System.out.println(
					un_cliente.getNombre() + " " + un_cliente.getNumero_cuenta() + " " + un_cliente.getSaldo());
		}
	}

}
