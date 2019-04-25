
public class Cliente {

	private String nombre;
	private String numero_cuenta;
	private double saldo;

	public Cliente(String nombre, String numero_cuenta, double saldo) {
		super();

		this.nombre = nombre;
		this.numero_cuenta = numero_cuenta;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero_cuenta() {
		return numero_cuenta;
	}

	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero_cuenta == null) ? 0 : numero_cuenta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Cliente)) {
			return false;
		}
		Cliente other = (Cliente) obj;
		if (numero_cuenta == null) {
			if (other.numero_cuenta != null) {
				return false;
			}
		} else if (!numero_cuenta.equals(other.numero_cuenta)) {
			return false;
		}
		return true;
	}

}
