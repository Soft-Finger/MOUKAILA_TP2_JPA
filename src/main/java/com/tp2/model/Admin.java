package com.tp2.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId () {
        return id;
    }

    public void setId ( Long id ) {
        this.id = id;
    }

}
