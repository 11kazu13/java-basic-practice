package zerojava.s08;

enum Weekday {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	
}

public class EnumData {
		public static void main(String[] args) {
			Weekday favoriteDayofWeek = Weekday.FRIDAY;
			
			System.out.print("一番好きな曜日：");
			System.out.println(favoriteDayofWeek);
		}
}


