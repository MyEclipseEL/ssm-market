package com.market.po;

public class SmSpecies {
    private Integer id;

    private Integer kId;

    private String kName;

    private Integer fId;

    private String kAcronym;

    private String kRemark;

    private Integer kA;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getkId() {
        return kId;
    }

    public void setkId(Integer kId) {
        this.kId = kId;
    }

    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName == null ? null : kName.trim();
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getkAcronym() {
        return kAcronym;
    }

    public void setkAcronym(String kAcronym) {
        this.kAcronym = kAcronym == null ? null : kAcronym.trim();
    }

    public String getkRemark() {
        return kRemark;
    }

    public void setkRemark(String kRemark) {
        this.kRemark = kRemark == null ? null : kRemark.trim();
    }

    public Integer getkA() {
        return kA;
    }

    public void setkA(Integer kA) {
        this.kA = kA;
    }
}