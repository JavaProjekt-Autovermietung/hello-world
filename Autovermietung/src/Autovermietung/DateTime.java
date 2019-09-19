package Autovermietung;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class DateTime {

	int Tag;
	int Monat;
	int Jahr;
	int Stunde;
	int Minute;
	LocalDateTime anfangsDatum, endDatum;

	
	LocalDateTime setDate() {return LocalDateTime.now();}
	LocalDateTime setDate(int uJahr, int uMonat, int uTag) {return LocalDateTime.of(uJahr, uMonat, uTag, 0, 0);}
	LocalDateTime setDate(int uJahr, int uMonat, int uTag, int uStunde, int uMinute){return LocalDateTime.of(uJahr, uMonat, uTag, uStunde, uMinute);}
	
	double ZeitSpanneStuden(LocalDateTime anfangsDatum, LocalDateTime endDatum) {
		
		double zsStunden = anfangsDatum.until(endDatum, ChronoUnit.MINUTES);
		
		zsStunden = (zsStunden/60)%24;
		return zsStunden;
		}
	
	static int ZeitSpanneTage (LocalDateTime anfangsDatum, LocalDateTime endDatum) {
		
		int zsTage =(int) anfangsDatum.until(endDatum, ChronoUnit.DAYS);
		return zsTage+1;
		}
	
	/* void test()
	{
		
		LocalDateTime date10 = setDate();
		System.out.println(date10);
		
		LocalDateTime date11 = setDate(2019, 8, 15, 9, 30);
		System.out.println(date11);
		
		LocalDateTime date12 = setDate(2019, 8, 17, 18, 15);
		System.out.println(date12);
		
		int Tage = ZeitSpanneTage(date11, date12);
		System.out.println("Tage "+ Tage);
		
		double Stunden = ZeitSpanneStuden(date11, date12);
		System.out.println(" Stunden "+ Stunden);
		
		
		long dauerLD = date11.until(date10, ChronoUnit.DAYS);
		System.out.println("Tage :" + dauerLD/24);
		
		System.out.println("Ein Tag später ist der: " + date12.plusDays(1));
		
		
		
	} */
	
}
