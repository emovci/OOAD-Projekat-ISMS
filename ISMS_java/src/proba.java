import java.util.*;
public class proba
{	
		public static void sabiranje(int max)
		{
			for(int i=0; i<max; i++)
			{
					System.out.println("Broj "+ i);
			
			} 
		}
		public static void main(String[] args) 
		{
			int max=5;
			sabiranje(max);
			String s="Test";
			if(s=="Test")
					System.out.println("Uspjelo");
			else
					System.out.println("Nije uspjelo");
			
			try {
				Datum pr= new Datum (32, 12 , 2011, 23, 23);
			} catch (InterruptedException e) {
				System.out.println("uspjelo!");
			}
			
			int[][] broj= new int[10][];
			for(int i=0; i<10; i++)
			{
					broj[i]=new int [i+1];
			}
			for(int i=0; i<10; i++)
			{
					for(int j=0; j<=i; j++)
					{
							System.out.print(broj[i][j]);
					}
					System.out.println();
			}
			Scanner ulaz= new Scanner (System.in);
			int i=ulaz.nextInt();
			for(int j=1; j<=i; j++)
			{
					System.out.println("Random broj "+j+" je "+Math.random());
			}
			ulaz.close();
			
			System.out.println("mo�da");
		}
		
		
}