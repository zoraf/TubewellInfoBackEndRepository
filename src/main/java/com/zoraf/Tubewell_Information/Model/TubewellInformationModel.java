package com.zoraf.Tubewell_Information.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TubewellInformationModel {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
