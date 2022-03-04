package com.tp2.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Exemplaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "exemplaire")
    private List<PretDocument> exemplaires;

    @ManyToOne
    private Document document;

    @ManyToOne
    private Client client;

    public Client getClient () {
        return client;
    }

    public void setClient ( Client client ) {
        this.client = client;
    }
}
