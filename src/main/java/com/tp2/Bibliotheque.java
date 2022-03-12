package com.tp2;

import com.tp2.model.Amende;
import com.tp2.persistence.*;
import com.tp2.service.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

public class Bibliotheque {
    public static void main ( String[] args ) throws ParseException {
        EmployeService employeService = new EmployeService( new EmployeRepoDAO());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        employeService.createEmployeEmprunteur( simpleDateFormat.parse("2020-01-12"), simpleDateFormat.parse("2020-01-26"), simpleDateFormat.parse("2020-01-30") );
        employeService.createEmployeEmprunteur( simpleDateFormat.parse("2020-01-12"), simpleDateFormat.parse("2020-01-26"), simpleDateFormat.parse("2020-01-30") );

        /*Amende amende1 = employeService.createAmende( 25.1, true);
        Amende amende2 = employeService.createAmende( 22.1, false);
        Set<Amende> amendeSet = new HashSet<Amende>();
        amendeSet.add( amende1 );
        amendeSet.add( amende2 );

        System.out.println(amende1);
        System.out.println(amende2);*/




        //adminService.createClient( "Mike", "wise", "1233 rue val", amendeSet,   );
    }
}
