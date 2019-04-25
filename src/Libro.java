
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

}
