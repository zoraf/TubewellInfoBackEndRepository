package com.zoraf.Tubewell_Information.Model;

import javax.persistence.*;

@Entity
public class PurposeOfUseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tubewell_information_id")
    private TubewellInformationModel tubewellInformationModel;

    @Column(name = "purpose_of_use")
    private String purposeOfUse;

    public PurposeOfUseModel() {
    }

    public PurposeOfUseModel(TubewellInformationModel tubewellInformationModel, String purposeOfUse) {
        this.tubewellInformationModel = tubewellInformationModel;
        this.purposeOfUse = purposeOfUse;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getPurposeOfUse() {
        return purposeOfUse;
    }

    public void setPurposeOfUse(String purposeOfUse) {
        this.purposeOfUse = purposeOfUse;
    }

    public TubewellInformationModel getTubewellInformationModel() {
        return tubewellInformationModel;
    }

    public void setTubewellInformationModel(TubewellInformationModel tubewellInformationModel) {
        this.tubewellInformationModel = tubewellInformationModel;
    }
}
