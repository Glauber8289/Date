import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// instanciando data e hora em java 
		 LocalDate d01 = LocalDate.now();
		 LocalDateTime d02 = LocalDateTime.now();
		 Instant d03 = Instant.now();
		 
		 System.out.println("d01= " + d01);
		 System.out.println("d02= " + d02);
		 System.out.println("d03= " + d03);
		 
		 //Pegar um texto e transformar em data no formato ISO8601
		 
		 LocalDate d04 = LocalDate.parse("2023-01-03");
		 LocalDateTime d05 = LocalDateTime.parse("2023-01-03T00:07:30");
		 Instant d06 = Instant.parse("2023-01-03T00:07:30Z");
		 Instant d07 = Instant.parse("2023-01-03T00:07:30-03:00");
		 System.out.println("d04= " + d04);
         System.out.println("d05= " + d05);
         System.out.println("d06= " + d06);
         System.out.println("d07= " + d07);
         
         //Texto em um formato customizado atraves do date time formarter https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
         DateTimeFormatter fmt1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
         DateTimeFormatter fmt2= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
         LocalDate d08= LocalDate.parse("03/01/2023",fmt1);
         LocalDateTime d09= LocalDateTime.parse("03/01/2023 21:35",fmt2);
        System.out.println("d08= " + d08);
        System.out.println("d09= " + d09);
        
        LocalDate d10 = LocalDate.of(2023, 01, 03);
        LocalDateTime d11 = LocalDateTime.of(2023, 1, 3, 21, 44);
        System.out.println("d10= " + d10);
        System.out.println("d11= " + d11);
        
        //Convertendo uma data global para local
        
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        
        //Mostrando a listagem dos Ids dos paises
        //for(String s : ZoneId.getAvailableZoneIds()) {
       // System.out.println(s);
       // }
	
	}

}
