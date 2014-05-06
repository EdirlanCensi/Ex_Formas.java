import java.util.*;
class Teste{
	public static void main(String args[]){
		
		Plano pl = new Plano(5);
		Circulo c ;
		Posicao p ;
		
		Scanner in = new Scanner(System.in);
		int op, valor;
		do{
			System.out.println("\n 1)Adiciona Circulo\n 2)Remove Circulo\n 3)Possui Circulo\n 4)Imprime Array de Circulos\n 5) Sair");
			
			op = in.nextInt();
			
			switch(op){
				case 1:
					c = new Circulo();
					p = new Posicao();
					
					System.out.println("Digite o Raio");
					c.setRaio( in.nextInt() );
					System.out.println("Digite X");
					p.setX( in.nextInt());
					System.out.println("Digite Y");
					p.setY( in.nextInt());
					c.setP( p );
					pl.adiciona( c );
					
				break;
				case 2:
					c = new Circulo();
					p = new Posicao();
					
					System.out.println("Digite o Raio");
					c.setRaio( in.nextInt() );
					System.out.println("Digite X");
					p.setX( in.nextInt());
					System.out.println("Digite Y");
					p.setY( in.nextInt());
					c.setP( p );
					pl.remove( c );
		
				break;
				case 3:
					c = new Circulo();
					p = new Posicao();
					System.out.println("Circulo a ser Encontrado");
					System.out.println("Digite o Raio");
					c.setRaio( in.nextInt() );
					System.out.println("Digite X");
					p.setX( in.nextInt());
					System.out.println("Digite Y");
					p.setY( in.nextInt());
					c.setP( p );
					if(  pl.possui(c) == true ){
						System.out.println("\nPossui!");
					}else{
						System.out.println("\nNao possui");
					}
				break;
				case 4:
					System.out.println("\nImprimindo array de circulos");
					pl.imprime();
				break;
			}
		}while(op != 5);
	}
}
