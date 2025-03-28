package br.com.escola.pessoa;


public class Aluno extends Pessoa{
	
	private String curso;
	private int nivel;

	public Aluno(String nome, int idade, String endereco) {
		super(nome, idade, endereco);
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void inscreverCurso(String cursoAluno) {
		setCurso(cursoAluno);
	}
	
	public void cancelarInscricao(String cursoCancel) {
		setCurso("");
		
	}
	
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	@Override
	public void mostrarInformações() {
		System.out.println(getNome());
		System.out.println(getIdade());
		System.out.println(getEndereco());
		System.out.println(getCurso());
		System.out.println(getNivel());
		
		
	}



	
		

}
