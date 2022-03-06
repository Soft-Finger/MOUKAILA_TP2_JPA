package com.tp2;

import com.tp2.model.Amende;
import com.tp2.persistence.AdminRepoDAO;
import com.tp2.persistence.AmendeRepoDAO;
import com.tp2.persistence.ClientRepoDAO;
import com.tp2.persistence.EmployeRepoDAO;
import com.tp2.service.AdminService;
import com.tp2.service.EmployeService;

import java.util.HashSet;
import java.util.Set;

public class Bibliotheque {
    public static void main ( String[] args ) {
        AdminService adminService = new AdminService( new ClientRepoDAO(), new AdminRepoDAO(), new EmployeRepoDAO() );
        EmployeService employeService = new EmployeService( new AmendeRepoDAO() );

        Amende amende1 = employeService.createAmende( 25.1, true);
        Amende amende2 = employeService.createAmende( 25.1, true);
        Set<Amende> amendeSet = new HashSet<Amende>();
        amendeSet.add( amende1 );
        amendeSet.add( amende2 );




        adminService.createClient( "Mike", "wise", "1233 rue val", amendeSet,   );
    }
}
