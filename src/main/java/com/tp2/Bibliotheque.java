package com.tp2;

import com.tp2.model.Amende;
import com.tp2.persistence.*;
import com.tp2.service.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Bibliotheque {
    public static Date CalculerDateRetour( int nombreJour) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, nombreJour);

        return simpleDateFormat.parse(simpleDateFormat.format(cal.getTime()));
    }

    public static void main ( String[] args ) throws ParseException {

    }
}
