package com.redsocial.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entidad.Jugador;
import com.redsocial.repositorio.JugadorRepositorio;

@Service
public class JugadorServicioImpl implements JugadorServicio {

	@Autowired
	private JugadorRepositorio repositorio;

	@Override
	public int eliminaJugador(long id) {
		 repositorio.deleteById(id);
		 return 0;
	}

	@Override
	public int insertaJugador(Jugador obj) {
		Jugador objNuevo = repositorio.save(obj);
		if(objNuevo == null) {
			return -1;
		}else {
			return 1;
		}
	}

	@Override
	public int actualizaJugador(Jugador obj) {
		Jugador objNuevo = repositorio.save(obj);
		if(objNuevo == null) {
			return -1;
		}else {
			return 1;
		}
	}

	@Override
	public List<Jugador> listaJugador(String filtro) {
		return repositorio.findAll();
	}

}






