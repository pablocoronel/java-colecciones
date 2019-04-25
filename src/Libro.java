
public class Libro {

	private String titulo;
	private String autor;
	private int ISBN;

	public Libro(String titulo, String autor, int iSBN) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = iSBN;
	}

	public String getDatos() {
		return "El titlo es: " + this.titulo + ", el autor es: " + this.autor + ", y el ISBN es: " + this.ISBN;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Libro)) {
			return false;
		}
		Libro other = (Libro) obj;
		if (ISBN != other.ISBN) {
			return false;
		}
		return true;
	}

	// sobreescritura de equals() para Libro, de forma manual
//	public boolean equals(Object obj) {
//		boolean respuesta = false;
//
//		if (obj instanceof Libro) {
//			// casteo
//			Libro a_comparar = (Libro) obj;
//
//			// comparacion
//			if (this.ISBN == a_comparar.ISBN) {
//				respuesta = true;
//			}
//		}
//
//		return respuesta;
//	}

}
