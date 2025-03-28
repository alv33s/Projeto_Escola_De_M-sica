package br.com.escola.Oagenda;

import java.util.ArrayList;
import java.util.List;

import br.com.escola.pessoa.Agendavel;

public class GerenciadorDeAulas implements Agendavel {
	
	private static GerenciadorDeAulas instancia;
	
	protected List <String> aulas;
	
	private GerenciadorDeAulas() {
		aulas = new ArrayList<>();
	}
	
	public static GerenciadorDeAulas getInstancia() {
		return instancia;
	}
	
	
	public static GerenciadorDeAulas acessarInstancia() {
		if(instancia == null) {
			return new GerenciadorDeAulas();
		}else {
			return instancia;
		}
		
	}
	
	@Override
	public void agendarAula(String agendar) {
		aulas.add(agendar);
	}
	
	@Override
	public void cancelarAula(String aula) {
		aulas.remove(aula);
	}

	
	
	
	
}
