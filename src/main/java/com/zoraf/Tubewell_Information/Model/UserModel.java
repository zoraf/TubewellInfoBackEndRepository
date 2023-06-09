package com.zoraf.Tubewell_Information.Model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long usereId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "organization_name")
    private String organizationName;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "is_active")
    @NotNull
    private Integer isActive;

    public UserModel() {
    }

    public UserModel( String userName, String organizationName, String mobileNumber, String email, String password, Integer isActive) {
        this.userName = userName;
        this.organizationName = organizationName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.password = password;
        this.isActive =isActive ;
    }

    public Long getUsereId() {
        return usereId;
    }

    public void setUsereId(Long usereId) {
        this.usereId = usereId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
}
