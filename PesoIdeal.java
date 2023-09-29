import java.util.Scanner;
public class PesoIdeal {
	public static void main(String[] args) {
		double alt, pesoIdeal;
		String sexo;
		int i=0, resp;
		
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Qual o seu sexo? (Digite f para FEMININO ou m para MASCULINO)");
			sexo = in.next();
			
			System.out.println("Qual a sua altura em centímetros?");
			alt = in.nextDouble();
			
			if (sexo.equalsIgnoreCase("f")) {
				pesoIdeal = 52 + (0.67 *(alt - 152.4));
				System.out.printf("O seu peso ideal é de %.2f",pesoIdeal);
				System.out.println();
			
			}else if (sexo.equalsIgnoreCase("m")){
				pesoIdeal = 52 + (0.75 *(alt - 152.4));
				System.out.printf("O seu peso ideal é de %.2f", pesoIdeal);
				System.out.println();
				
			}else {
				System.out.println("Altura ou sexo informados incorretamente.");
			}
			
			System.out.println("Deseja continuar a execução? (1-para SIM ou 2-para NÃO)");
			resp = in.nextInt();
			i++;
				
		} while (resp == 1);
		in.close();
	}
}
