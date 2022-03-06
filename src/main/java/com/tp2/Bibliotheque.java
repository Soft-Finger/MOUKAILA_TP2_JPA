package com.tp2;

import com.tp2.model.Users;
import com.tp2.persistence.UsersRepoDAO;
import com.tp2.service.UserService;

public class Bibliotheque {
    public static void main ( String[] args ) {
        UserService userService = new UserService( new UsersRepoDAO() );

        userService.createEmploye( "Mike", "Wise" );
        userService.createClient( "Ron", "Paul" );
        userService.createAdmin( "Bruce", "Wallas" );
    }
}
