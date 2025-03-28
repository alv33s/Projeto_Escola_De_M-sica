package br.com.escola.pessoa;
import br.com.escola.Oagenda.*;

public class Professor extends Pessoa implements Agendavel {
	
	private String cursoAula;
	

	public Professor(String nome, int idade, String endereco,String cursoAula) {
		super(nome, idade, endereco);
		this.cursoAula = cursoAula;
	}

	public String getCursoAula() {
		return cursoAula;
	}

	public void setCursoAula(String cursoAula) {
		this.cursoAula = cursoAula;
	}


	@Override
	public void mostrarInformações() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agendarAula(String agendar) {
		GerenciadorDeAulas gerenciador = GerenciadorDeAulas.getInstancia();
		gerenciador.aulas.add(agendar);
		
	}

	@Override
	public void cancelarAula(String aula) {
		// TODO Auto-generated method stub
		
	}
	
		

}
