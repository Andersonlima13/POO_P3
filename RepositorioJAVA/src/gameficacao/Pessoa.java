package gameficacao;

// ideia geral : aplicação de gameficaão, onde o jogador (o proprio usuario) , ganha e aumenta pontos a partir de atividades , que devem seguir uma regras
//e algoritimos para upar de level , o mesmo deverá upar seus atributos , fazendo atividades que podem aumentar e diminuir seu progresso
// baseado em solo leveling





public class Pessoa {
	int saude;
	int disciplina;
	int nivel;
	int forca;
	int inteligencia;
	int energia;
	
	
	
// DAYLY QUESTS - > RETORNA UMA LISTA COM AS MISSOES DIARIAS DE SEU DIA : EXEMPLO -> TREINAR , ESTUDAR , LER ..
// IDEIA -> ADCIONAR EXERCICIOS MENTAIS , ESSAS MISSOES TERÃO RECOMPENSAS QUE SE CONCLUIDAS , OS ATRIBUTOS DA CLASS PESSOA SOFREM ALTERAÇOES
// O NAO CUMPLIMENTO DE MISSOES DIARIAS CAUSAM UMA PERDA NOS PONTOS DE ATRIBUTO;
// PS CRIAR UM METODO (ADCIONAR MISSOES) , PARA QUE FIQUE RESPONSAVEL POR RECEBER AS MISSOES DO DIA , COMO PARAMETRO , EXPLICANDO O TEMPO
	
	
	
	
	public static String add_dailyquest(String missao1, String missao2, String missao3, String missao4, String missao5){
		String quests = add_dailyquest(missao1,missao2,missao3,missao4,missao5);
		return quests;
		
	}

	void daily_quests() {
		System.out.println(quests);
		
		
		
// ao inves de prints , surgem aqui as variaveis com as informações de tempo de execuução de cada missao
		
	}

}



