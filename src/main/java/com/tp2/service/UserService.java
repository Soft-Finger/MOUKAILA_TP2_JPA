package com.tp2.service;

import com.tp2.model.Users;

public class UserService {
    private UsersRepository usersRepository;

    public UserService ( UsersRepository usersRepository ) {
        this.usersRepository = usersRepository;
    }

    public void createClient ( String nomClient , String prenomClient ) {

        Users users = Users.builder()
                .nom( nomClient )
                .prenom( prenomClient )
                .build();
        //usersRepository.saveClient( (Client) users );
    }

    public void createEmploye ( String nomEmploye , String prenomEmploye ) {
        Users users = Users.builder()
                .nom( nomEmploye )
                .prenom( prenomEmploye )
                .build();
       // usersRepository.saveEmploye( (Employe) users );
    }

    public void createAdmin ( String nomAdmin , String prenomAdmin ) {
        Users users = Users.builder()
                .nom( nomAdmin )
                .prenom( prenomAdmin )
                .build();
       // usersRepository.saveAdmin( (Admin) users );
    }

}
