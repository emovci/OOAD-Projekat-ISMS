package klase;

public class Datum 
{
	private int dan;
	private int mjesec;
	private int godina;
	private int sati; 
	private int minute;
	
	public Datum  (int dan, int mjesec, int godina, int sati, int minute) throws InterruptedException
	{
		//provjera da li je godina prijestupna
			int[]dani={31,28,31,30,31,30,31,31,30,31,30,31};
			if ((godina%4==0 && godina%100!=0) || godina%400==0)
					dani[2]++;
		//provjera da li je datum i vremena validna
			if(mjesec<=0 || mjesec >=12 || dan<1 || dan>dani[mjesec+1] ||  godina <2010 || sati >=24 || sati <0 || minute>=60 || minute<0)
					throw new InterruptedException();
			this.dan=dan;
			this.mjesec=mjesec;
			this.godina=godina;
			this.sati=sati;
			this.minute=minute;
			
			
	}
	
	public String daj_string ()
	{
			return ""+dan+". "+mjesec+". "+godina+". "+sati+":"+minute;
	}
	

}
