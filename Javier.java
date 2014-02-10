import java.util.Scanner;
public class Javier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<5;i ++){
			Scanner mi_scanner=new Scanner(System.in);
				int x=mi_scanner.nextInt();
				if (x >= 10)
					{
						System.out.println(" es igual o Mayor que de 10 ");
					}else
					{
						System.out.println("Es Menor a 10");
					}*/
				
			Scanner mi_scanner=new Scanner(System.in);
			for(int i=0;i<10;i=i+1)
			{
				System.out.print("ingrese Nota");
				int nota=mi_scanner .nextInt();
				if(nota >=90)
				{
					System.out.println("Excelente");
				}else if(nota >=80)
				{
					System.out.println("Muy Bueno");
				}else if(nota >=70)
				{
					System.out.println("Bueno");
				}else if(nota >=60)
				{
					System.out.println("Malo");
				}else if(nota >=50)
				{
					System.out.println("Reprovado");
				}else if(nota >=45)
				{
					System.out.println("Repetiste Año");
				}else
				{
					System.out.println("Cambio de Ambiente");
				}
	}

}
}