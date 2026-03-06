package Interface;

import Dominio.VideoJuegos;

public interface Metodos {
	public void guardar(VideoJuegos game);
	public void mostrar();
	public VideoJuegos buscar(String nombre);
	public void editar(VideoJuegos game);
	public void eliminar (String nombre);
	
}
