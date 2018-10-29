package com.kindred.DataSet.dao;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "TUSER_DETAILS ")
public class tuserdetails implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "TEST_USERNAME")
    private String testUserName;

    @Column(name = "PROFILE")
    private String profile;

    @Column(name = "PROVIDER_NAME")
    private String providerName;

    @Column(name = "COUNTRY")
    private String country;

    protected tuserdetails() {
    }

    public tuserdetails(String testUserName, String profile, String providerName, String country) {
        this.testUserName = testUserName;
        this.profile = profile;
        this.providerName = providerName;
        this.country = country;
    }

    @Override
    public String toString() {
        return String.format("tuserdetails[testUserName=%d, profile='%s', providerName='%s',country='%s']", testUserName, profile, providerName, country);
    }
}

