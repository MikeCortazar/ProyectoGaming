package Implementacion;

import java.util.HashMap;

import Dominio.VideoJuegos;
import Interface.Metodos;

public class LogicaMetodos implements Metodos {

	//Los tipos de datos primitivos se agregan parseados en el hashMap
	private HashMap<String, VideoJuegos> registrosHashMap = new HashMap<String, VideoJuegos>();
	
	@Override
	public void guardar(VideoJuegos game) {
		// TODO Auto-generated method stub
	registrosHashMap.put(game.getTiulo(), game);
		
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(registrosHashMap);
		
	}

	@Override
	public VideoJuegos buscar(String nombre) {
		// TODO Auto-generated method stub
		return registrosHashMap.get(nombre);
	}

	@Override
	public void editar(VideoJuegos game) {
		// TODO Auto-generated method stub
		registrosHashMap.put(game.getTiulo(), game);
		
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		registrosHashMap.remove(nombre);
		
	}
	
	public int contarRegHM() {
		return registrosHashMap.size();
	}
	
	

}
