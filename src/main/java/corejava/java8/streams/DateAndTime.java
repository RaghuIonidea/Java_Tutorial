package corejava.java8.streams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Year;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2021,05,8);
        Period p = Period.between(birthday,today);
        System.out.printf("age is %d year %d months %d days",p.getYears(),p.getMonths(),p.getDays());
        System.out.println("==============");
        Year y = Year.of(LocalDateTime.now().getYear());
        if (y.isLeap())
            System.out.println(y+" is leap year ");
        else
            System.out.println(y+" is not leap year ");
    }
}
