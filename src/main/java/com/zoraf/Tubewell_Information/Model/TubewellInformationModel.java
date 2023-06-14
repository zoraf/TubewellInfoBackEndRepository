package com.zoraf.Tubewell_Information.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TubewellInformationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "owner_name")
    private String ownerName;

    @Column(name = "owner_type")
    private String ownerType;

    @Column(name = "date_of_installation")
    private String dateOfInstallation;

    @Column(name = "is_approval_taken")
    private String isApprovalTaken;

    @Column(name = "approval_authority")
    private String approvalAuthority;

    @Column(name = "last_approval_date")
    private String lastApprovalDate;

    @Column(name = "no_of_user")
    private String noOfUser;


    @OneToMany(mappedBy = "tubewellInformationModel", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<PurposeOfUseModel> purposeOfUsage = new ArrayList<PurposeOfUseModel>();

    @Column(name = "amount_of_water_use")
    private String amountOfWaterUse;

    @Column(name = "tubewell_type")
    private String tubewellType;

    @Column(name = "mode_of_abstraction")
    private String modeOfAbstraction;

    @Column(name = "length_of_pipe_used")
    private String lengthOfPipeUsed;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;


    @Column(name = "email")
    private String userEmail;
    public TubewellInformationModel() {
    }

    public TubewellInformationModel(String ownerName, String ownerType, String dateOfInstallation, String isApprovalTaken, String approvalAuthority, String lastApprovalDate, String noOfUser, List<PurposeOfUseModel> purposeOfUsage, String amountOfWaterUse, String tubewellType,
                                    String modeOfAbstraction, String lengthOfPipeUsed, String latitude, String longitude) {
        this.ownerName = ownerName;
        this.ownerType = ownerType;
        this.dateOfInstallation = dateOfInstallation;
        this.isApprovalTaken = isApprovalTaken;
        this.approvalAuthority = approvalAuthority;
        this.lastApprovalDate = lastApprovalDate;
        this.noOfUser = noOfUser;
        this.purposeOfUsage = purposeOfUsage;
        this.amountOfWaterUse = amountOfWaterUse;
        this.tubewellType = tubewellType;
        this.modeOfAbstraction = modeOfAbstraction;
        this.lengthOfPipeUsed = lengthOfPipeUsed;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public String getDateOfInstallation() {
        return dateOfInstallation;
    }

    public void setDateOfInstallation(String dateOfInstallation) {
        this.dateOfInstallation = dateOfInstallation;
    }

    public String getIsApprovalTaken() {
        return isApprovalTaken;
    }

    public void setIsApprovalTaken(String isApprovalTaken) {
        this.isApprovalTaken = isApprovalTaken;
    }

    public String getApprovalAuthority() {
        return approvalAuthority;
    }

    public void setApprovalAuthority(String approvalAuthority) {
        this.approvalAuthority = approvalAuthority;
    }

    public String getLastApprovalDate() {
        return lastApprovalDate;
    }

    public void setLastApprovalDate(String lastApprovalDate) {
        this.lastApprovalDate = lastApprovalDate;
    }

    public String getNoOfUser() {
        return noOfUser;
    }

    public void setNoOfUser(String noOfUser) {
        this.noOfUser = noOfUser;
    }

    public List<PurposeOfUseModel> getPurposeOfUsage() {
        return purposeOfUsage;
    }

    public void setPurposeOfUsage(List<PurposeOfUseModel> purposeOfUsage) {
        this.purposeOfUsage = purposeOfUsage;
    }

    public String getAmountOfWaterUse() {
        return amountOfWaterUse;
    }

    public void setAmountOfWaterUse(String amountOfWaterUse) {
        this.amountOfWaterUse = amountOfWaterUse;
    }

    public String getTubewellType() {
        return tubewellType;
    }

    public void setTubewellType(String tubewellType) {
        this.tubewellType = tubewellType;
    }

    public String getModeOfAbstraction() {
        return modeOfAbstraction;
    }

    public void setModeOfAbstraction(String modeOfAbstraction) {
        this.modeOfAbstraction = modeOfAbstraction;
    }

    public String getLengthOfPipeUsed() {
        return lengthOfPipeUsed;
    }

    public void setLengthOfPipeUsed(String lengthOfPipeUsed) {
        this.lengthOfPipeUsed = lengthOfPipeUsed;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
