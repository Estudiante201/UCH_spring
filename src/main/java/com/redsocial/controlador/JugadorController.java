package com.redsocial.controlador;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.redsocial.entidad.Jugador;
import com.redsocial.servicio.JugadorServicio;

@Controller
public class JugadorController {

	@Autowired
	private JugadorServicio servicio;

	@RequestMapping("/verJugador")
	public String verPagina(Model m) {
		List<Jugador> list = servicio.listaJugador("");
		m.addAttribute("jugadores", list);
		return "crudJugador";
	}
	
	
	@RequestMapping("/listaJugador")
	public String lista(@RequestParam Map<String,String> params, Model m) {
		List<Jugador> list = servicio.listaJugador(params.get("filtro"));
		m.addAttribute("jugadores", list);
		return "crudJugador";
	}
	
	@RequestMapping("/registraJugador")
	public String metodoRegistra(Jugador obj, Model m) {
		servicio.insertaJugador(obj);
		List<Jugador> list = servicio.listaJugador("");
		m.addAttribute("jugadores", list);
		return "crudJugador";
	}
	
	@RequestMapping("/actualizaJugador")
	public String metodoActualiza(Jugador obj, Model m) {
		servicio.actualizaJugador(obj);
		List<Jugador> list = servicio.listaJugador("");
		m.addAttribute("jugadores", list);
		return "crudJugador";
	}
	
	@RequestMapping("/eliminaJugador")
	public String metodoElimina(@RequestParam Map<String,String> params, Model m) {
		servicio.eliminaJugador(Integer.parseInt(params.get("id")));
		
		List<Jugador> list = servicio.listaJugador("");
		m.addAttribute("jugadores", list);
		
		return "crudJugador";
	}
	
	
	

	
	
		
	
	
	
	
	
	

}