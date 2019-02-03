import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;


public class EsempioLocalDate {
  public static void main(String[] args) {
    
    /*  LocalDate
	*	rappresenta una data
	*/
    
    // Data odierna
    LocalDate oggi  = LocalDate.now();
    System.out.println("oggi è " + oggi);
    System.out.println("anno " + oggi.getYear());  
    System.out.println("mese " + oggi.getMonth());
    System.out.println("numero mese " + oggi.getMonthValue()); 
    System.out.println("giorno del mese " + oggi.getDayOfMonth());
    System.out.println("day of week " + oggi.getDayOfWeek());   
	// Giorno della settimana
	String giornoSettimana = oggi.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
	System.out.println("giorno della settimana " + giornoSettimana);    
    
	// Creazione di un oggetto data
    LocalDate natale  = LocalDate.of(2019, 12, 25);
    System.out.println(natale);
    
    // Formattazione data in italiano
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String s = natale.format(formatter);
    System.out.println(s);
    
    // Differenza fra due date
	Period p = Period.between(natale, oggi);
	System.out.println("Differenza tra " + oggi + " e " + natale + 
		               " = " + p.getDays() + " giorni e " + p.getMonths() + " mesi");

	/* LocalTime
	*  rappresenta un orario
	*/

    // ora attuale
    LocalTime adesso = LocalTime.now();
    System.out.println("adesso sono le " + adesso);
    System.out.println("ore " + adesso.getHour());    
    System.out.println("minuti " + adesso.getMinute());  
    System.out.println("fra mezz'ora sono le " + adesso.plusMinutes(30));      
    
    // mezzogiorno
    LocalTime  mezzogiorno = LocalTime.of(12, 00);
    System.out.println("mezzogiorno " + mezzogiorno);
	
	/* LocalDateTime
	*  rappresenta una data con un orario
	*/

    // Data ora attuali 
    LocalDateTime  questoMomento = LocalDateTime.now();
    System.out.println(questoMomento);
    
  }
}

