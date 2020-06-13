package usuarios;

public class Usuario {

	private String nombre;
	private int juegosGanados;
	
	private Usuario siguiente;
	
	public Usuario (String nombre) {
		this.nombre= nombre;
		this.juegosGanados = 0;
		this.siguiente = null;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Usuario siguiente) {
		this.siguiente = siguiente;
	}

	public void addJuegoGanado() {
		this.juegosGanados ++;
	}
	
	public int getJuegosGanados() {
		return this.juegosGanados;
	}
	
	
}
