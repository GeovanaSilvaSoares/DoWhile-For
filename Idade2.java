import java.util.Scanner;
public class Idade2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int anoAtual, anoNascimento, i, idade, maior=0, menor=1000;
		
		System.out.println("Qual � o ano atual?");
		anoAtual = in.nextInt();
		
		for(i=1; i<11; i++) {
			System.out.println("Qual � o ano de nascimento?");
			anoNascimento = in.nextInt();
			
			idade=anoAtual-anoNascimento;
			
			if(idade>1){		
				System.out.println (i+"� usu�rio: "+ idade+ " anos");
			
			}else {
				System.out.println (i+"� usu�rio: "+ idade+ " ano");
			}
					
			if(idade>maior){
				maior = idade;
			}
			
			if(idade<menor){
				menor = idade;
			}
		}
			
			
		if(menor==1){
			System.out.println("O mais velho tem " + maior + " anos, e o mais novo " + menor + " ano");
				
		}else{
			System.out.println("O mais velho tem " + maior + " anos, e o mais novo " + menor + " anos");
		}		
		
		}
	}

