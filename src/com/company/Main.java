package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ViewWateringSchedule();
    }

    public static void ViewWateringSchedule() {
        System.out.println("enter a to view the watering schedule for Jade, Dracaena, Snake Plant, or Money Tree");
        System.out.println("enter b to view the watering schedule for Croton, Fiddle Leaf Fig, or Spider Plant");
        System.out.println("enter c to view the watering schedule for Bell Pepper Plant, Strawberry Plant, or Bird's Nest Fern");
        System.out.println("Enter d to view the watering schedule for Wavy Fern");
        LocalDate firstDayToWater = LocalDate.of(2019, 12, 16);
        Scanner letterPressed = new Scanner(System.in);
        String input = letterPressed.nextLine();
        if (input.equals("a")) {
            System.out.println("Jade, Dracaena, Snake Plant and Money Tree need to be watered on the " +
                    "following days \n");
            System.out.println(firstDayToWater);
            for (int i = 0; i < 84; ) {
                i += 14;

                if (firstDayToWater.plusDays(i).getDayOfWeek() == DayOfWeek.SATURDAY) {
                    System.out.println(firstDayToWater.plusDays(i-1));
                } else if (firstDayToWater.plusDays(i).getDayOfWeek() == DayOfWeek.SUNDAY) {
                    System.out.println(firstDayToWater.plusDays(i+1));
                } else {
                    System.out.println(firstDayToWater.plusDays(i));
                }
                //ViewWateringSchedule();
            }
            ViewWateringSchedule();
        } else if (input.equals("b")) {
            System.out.println("Croton, Fiddle Leaf Fig, and Spider Plant need to be watered on the follwoing dates: \n");
            System.out.println(firstDayToWater);

            for (int i = 0; i < 84; ) {
                i += 7;

                if (firstDayToWater.plusDays(i).getDayOfWeek() == DayOfWeek.SATURDAY) {
                    System.out.println(firstDayToWater.plusDays(i-1));
                } else if (firstDayToWater.plusDays(i).getDayOfWeek() == DayOfWeek.SUNDAY) {
                    System.out.println(firstDayToWater.plusDays(i+1));

                } else {
                    System.out.println(firstDayToWater.plusDays(i));
                }
            }
            ViewWateringSchedule();

        } else if (input.equals("c")) {
            System.out.println("Bell Pepper Plant, Strawberry Plant, and Bird's Nest Fern need to be watered on the following days: \n");
            System.out.println(firstDayToWater);

            for (int i = 0; i < 84; ) {
                i += 3;
                if (firstDayToWater.plusDays(i).getDayOfWeek() == DayOfWeek.SATURDAY) {
                    System.out.println(firstDayToWater.plusDays(i-1));
                } else if (firstDayToWater.plusDays(i).getDayOfWeek() == DayOfWeek.SUNDAY) {
                    System.out.println(firstDayToWater.plusDays(i+1));

                } else {
                    System.out.println(firstDayToWater.plusDays(i));
                }
            }
            ViewWateringSchedule();

        } else if (input.equals("d")) {
            System.out.println("Wavy Fern needs to be watered on the following dates: \n");
            System.out.println(firstDayToWater);

            for (int i = 0; i < 84; ) {
                i += 2;
                if (firstDayToWater.plusDays(i).getDayOfWeek() == DayOfWeek.SATURDAY) {
                    System.out.println(firstDayToWater.plusDays(i-1));
                } else if (firstDayToWater.plusDays(i).getDayOfWeek() == DayOfWeek.SUNDAY) {
                    System.out.println(firstDayToWater.plusDays(i+1));

                } else {
                    System.out.println(firstDayToWater.plusDays(i));
                }
            }
            ViewWateringSchedule();
        } else  {
            ViewWateringSchedule();
        }
    }
}