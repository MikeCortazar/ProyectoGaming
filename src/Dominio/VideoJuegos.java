package Dominio;

public class VideoJuegos {
	private String tiulo;
	private char clasificacion;
	private float precio;
	private int stock;

	public VideoJuegos(String tiulo, char clasificacion, float precio, int stock) {
		this.tiulo = tiulo;
		this.clasificacion = clasificacion;
		this.precio = precio;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "VideoJuegos [tiulo=" + tiulo + ", clasificacion=" + clasificacion + ", precio=" + precio + ", stock="
				+ stock + "]";
	}

	public String getTiulo() {
		return tiulo;
	}

	public void setTiulo(String tiulo) {
		this.tiulo = tiulo;
	}

	public char getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(char clasificacion) {
		this.clasificacion = clasificacion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
