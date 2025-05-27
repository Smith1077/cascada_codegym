package codegym.pe.fileclass.lesson26;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        System.out.println("-----------");

        LocalTime currentTime = LocalTime.now();
        System.out.println("1. Tiempo actual = "+currentTime);

        int hours = 3;
        LocalTime currentAddHours = currentTime.plusHours(hours);
        System.out.println("2. Tiempo horas añadido = "+currentTime+" + "+hours+" horas "+" = "+currentAddHours);

        int minutes = 40;
        LocalTime currentAddMinutes = currentAddHours.plusMinutes(minutes);
        System.out.println("2. Tiempo minutos añadido = "+currentAddHours+" + "+minutes+" minutos "+" = "+currentAddMinutes);

        int seconds = 60;
        LocalTime currentAddHSeconds = currentAddMinutes.plusSeconds(seconds);
        System.out.println("2. Tiempo segundos añadido = "+currentAddMinutes+" + "+seconds+" segundos "+" = "+currentAddHSeconds);

        int nanos = 2516;
        LocalTime currentAddNanos = currentAddHSeconds.plusNanos(nanos);
        System.out.println("2. Tiempo nanosegundos añadido = "+currentAddHSeconds+" + "+nanos+" nanos "+" = "+currentAddNanos);

        LocalTime specificTime = LocalTime.of(22,6,45,4325);
        System.out.println(specificTime);
        System.out.println("hora: "+specificTime.getHour());
        System.out.println("minuto: "+specificTime.getMinute());
        System.out.println("segundo: "+specificTime.getSecond());
        System.out.println("nanosegundo: "+specificTime.getNano());

    }
}
