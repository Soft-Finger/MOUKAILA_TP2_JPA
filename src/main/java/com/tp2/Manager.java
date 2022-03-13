package com.tp2;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Manager {
        public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliothequeTp2");

}
