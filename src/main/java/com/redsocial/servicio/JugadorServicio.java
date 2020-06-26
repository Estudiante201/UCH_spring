package com.redsocial.servicio;

import java.util.List;

import com.redsocial.entidad.Jugador;

public interface JugadorServicio  {

	public abstract int eliminaJugador(long id) ;
	public abstract int insertaJugador(Jugador  obj) ;
	public abstract int actualizaJugador(Jugador obj) ;
	public abstract List<Jugador> listaJugador(String filtro) ;

	
	
}
