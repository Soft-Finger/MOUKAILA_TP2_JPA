package com.tp2.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Admin extends Users {
    private String login;
    private String password;

}
