package gameficacao;

// ideia geral : aplicação de gameficaão, onde o jogador (o proprio usuario) , ganha e aumenta pontos a partir de atividades , que devem seguir uma regras
//e algoritimos para upar de level , o mesmo deverá upar seus atributos , fazendo atividades que podem aumentar e diminuir seu progresso
// baseado em solo leveling



public class Metodos {
	boolean status; 
	int pontuacao;
	
	public void saude(int pontos, boolean status){
		this.status = status;
		if(status == true) {
			pontuacao = pontuacao + pontos;
		}else {
			pontuacao = pontuacao - pontos;
		}
	public void dormir(int quantidade) {
			
		
	}
	
	public void exercitou(int tempo) {
		
	}
	
	public void estudo(int tempo, int conteudos) {
		
	}
	
	
		
		
	}

}



