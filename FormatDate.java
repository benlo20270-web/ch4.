public class FormatDate {
	public static void printAmerican(String day, String month,  int date, int year){
	System.out.println(day + " , " + month + " " + date + " , " + year);
	}
	public static void printEuropean(String day, String month,  int date, int year){
	System.out.print(day + " " +  date + " " + month + " " + year);
}
	public static void main(String[] args){
	printAmerican("Monday", "November", 28, 2026);
	printEuropean("Monday", "November", 28, 2026);
	}
}
