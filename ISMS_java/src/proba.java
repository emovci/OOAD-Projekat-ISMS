import java.util.*;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
			/*
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
			
			System.out.println("mo�da");*/
			//ArrayList<ArrayList<double> >  a;
			//a.add(new ArrayList<double>(3));			
			Vector <Vector <Double>> a= new Vector <Vector <Double>> ();
			a.addElement(new Vector <Double> (3));
			a.get(0).addElement(new Double (3));
			a.get(0).addElement(new Double (1));
			a.get(0).addElement(new Double (2));
			a.get(0).get(1);
			System.out.println("veli�ina vektora je: "+a.size()+", a oni brojevi su:  "+a.get(0).get(0)+a.get(0).get(1)+a.get(0).get(2));
			//Vector <Double> b= new Vector <Double> {1,2,3,4,5,6};

			try {
				Datum g = new Datum (12,2,2011,12,12);
				System.out.println(g.datum_string());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			Vector< Vector <String>> rowData = new Vector<Vector<String>>();
			Vector<String> temprow = new Vector<String>();
			for (int i = 0; i < 4; i++) 
		    {
		    		temprow.addElement("123");
		    }	
		      //for (int j = 0; i < 4; i++)
		      rowData.add(temprow);
		      rowData.add(temprow);
		    
		    
		    String[] columnNames = {"a","b","c","d"};
		    
		    Vector columnNamesV = new Vector(Arrays.asList(columnNames));

		    JTable table = new JTable(rowData, columnNamesV);
		    JFrame f = new JFrame();
		    f.setSize(300, 300);
		    f.add(new JScrollPane(table));
		    f.setVisible(true);
		  
		}
		
		
}