package com.zoraf.Tubewell_Information.POJO;

import java.io.Serializable;
import java.util.List;

public class TubewellInformation implements Serializable {

    private String ownerName;

    private String ownerType;

    private String dateOfInstallation;

    private String isApprovalTaken;

    private String approvalAuthority;

    private String lastApprovalDate;

    private String noOfUser;

    private List<String> purposeOfUsage;

    private String amountOfWaterUse;

    private String tubewellType;

    private String modeOfAbstraction;

    private String lengthOfPipeUsed;

    public TubewellInformation() {
    }

    public TubewellInformation(String ownerName, String ownerType, String dateOfInstallation, String isApprovalTaken, String approvalAuthority, String lastApprovalDate, String noOfUser, List<String> purposeOfUsage,
                               String amountOfWaterUse, String tubewellType, String modeOfAbstraction, String lengthOfPipeUsed) {
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

    public List<String> getPurposeOfUsage() {
        return purposeOfUsage;
    }

    public void setPurposeOfUsage(List<String> purposeOfUsage) {
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
}
