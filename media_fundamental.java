package media_fundamental;

import java.util.Scanner;

public class media_fundamental {
	
	@SuppressWarnings({ "resource"}) //suprimir ou ignorar avisos do compilador
	public static void main(String[] args) {
		
	// Novo Scanner: ("ler")
		
	Scanner ler = new Scanner(System.in);
	
	// Variaveis 

	int i; 									//varivel de permanecia do for ("liga/desliga")
	
	int ra;									//RA do aluno
	
	int nota_um, nota_dois, nota_tres;		//notas 1,2 e 3
	
	float result;							//Resultado
	
	//inicio FOR
	for(i = 1; i == 1;){
		
		System.out.printf("\n Digite seu RA: ");
		ra = ler.nextInt(); //leitura do RA
		
		//se "ra" for diferente de 0 
		if (ra != 0) {
			System.out.printf("\n Aluno %d",ra);
			System.out.printf("\n Digite a primeira nota: ");
			nota_um = ler.nextInt(); //leitura da primeira nota
			
			System.out.printf("\n Digite a segunda nota: ");
			nota_dois = ler.nextInt(); //leitura da segunda nota
			
			System.out.printf("\n Digite a terceira nota: ");
			nota_tres = ler.nextInt(); //leitura da terceira nota
			
			result = (nota_um + nota_dois + nota_tres) / 3;
			
			//se media for maior ou igual a 8 = Aluno Aprovado
			if (result >= 8) { 
				System.out.printf("\n ALUNO %d APROVADO!",ra);
			}
			
			//se media for dentre  6 a 8 = Aluno em recuperação
			else if (result >= 6 && result < 8) {
				System.out.printf("\n ALUNO %d RECUPERAÇÃO!",ra);
			}
			//se não Aluno reprovado
			else{
				System.out.printf("\n ALUNO %d REPROVADO!",ra);
			}
		}
		//caso RA = 0 termino do codigo
		else {
			System.out.printf("\n RA INVALIDO");
			i = 0;
		} 
	}
	
	}
}
