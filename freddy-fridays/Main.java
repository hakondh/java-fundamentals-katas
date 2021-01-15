import java.time.DayOfWeek;
import java.time.LocalDate;

class Main {
    
    public static void main(String[] args){
        // Count for each particular year from 2021-3000
        LocalDate today = LocalDate.of(2021, 01, 01);
        LocalDate end = LocalDate.of(3000, 12, 31);
        int max = 0;

        for(LocalDate date = today; date.isBefore(end); date = date.plusYears(1)) {
            int count = getFreddyFridaysCount(date, date.plusYears(1));
            System.out.println(date.getYear() + ":" + count + " ");
            if(count > max) max = count;
        }


        System.out.println("\nThe max amount in this range is: " + max);
        System.out.println("Years in which there is a maximum number of Friday the 13th");
        for(LocalDate date = today; date.isBefore(end); date = date.plusYears(1)) {
            int count = getFreddyFridaysCount(date, date.plusYears(1));
            if(count == max) System.out.println(date.getYear() + " ");
        }        
    }

    private static int getFreddyFridaysCount(LocalDate start, LocalDate end) {
        int count = 0;
        for(LocalDate date = start; date.isBefore(end); date = date.plusDays(1)) {
            if(date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13) count++;
        }
        return count;
    }
}