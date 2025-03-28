package br.com.escola.Fcursos;


public class Factorycursos {
	
	public static Icurso criarCurso(String tipo) {
		if(tipo.equalsIgnoreCase("Instrumental")) {
			return new Instrumento();
		} else if(tipo.equalsIgnoreCase("Canto")) {
			return new Canto();
		} else if(tipo.equalsIgnoreCase("Teoria musical")) {
			return new TeoriaMusical();
		} else { 
			System.out.println("Curso desconhecido: " + tipo);
			return null;
		}
		
	}

}
