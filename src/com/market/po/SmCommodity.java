package com.market.po;


public class SmCommodity {
    private Integer comId;

    private Integer kId;

    private Integer supId;

    private String comName;

    private String comNum;

    private Integer comState;

    private String comBrand;//品牌

    private String comProduced;//生产日期

    private String comEsl;//保质期

    private String comDiscount;

    private String comSellprice;

    private String comUnit;//单位

    private Integer comCount;//库存

    private Integer comRedline;//底线

    private Integer shelfId;//货架


    private SmSpecies species;//类别

    private SmSupplier sup;

    private SmShelt shelt;

    public SmSpecies getSpecies() {
        return species;
    }

    public void setSpecies(SmSpecies species) {
        this.species = species;
    }

    public SmSupplier getSup() {
        return sup;
    }

    public void setSup(SmSupplier sup) {
        this.sup = sup;
    }

    public SmShelt getShelt() {
        return shelt;
    }

    public void setShelt(SmShelt shelt) {
        this.shelt = shelt;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Integer getkId() {
        return kId;
    }

    public void setkId(Integer kId) {
        this.kId = kId;
    }

    public Integer getSupId() {
        return supId;
    }

    public void setSupId(Integer supId) {
        this.supId = supId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName == null ? null : comName.trim();
    }

    public String getComNum() {
        return comNum;
    }

    public void setComNum(String comNum) {
        this.comNum = comNum == null ? null : comNum.trim();
    }

    public Integer getComState() {
        return comState;
    }

    public void setComState(Integer comState) {
        this.comState = comState;
    }

    public String getComBrand() {
        return comBrand;
    }

    public void setComBrand(String comBrand) {
        this.comBrand = comBrand == null ? null : comBrand.trim();
    }

    public String getComProduced() {
        return comProduced;
    }

    public void setComProduced(String comProduced) {
        this.comProduced = comProduced == null ? null : comProduced.trim();
    }

    public String getComEsl() {
        return comEsl;
    }

    public void setComEsl(String comEsl) {
        this.comEsl = comEsl == null ? null : comEsl.trim();
    }

    public String getComDiscount() {
        return comDiscount;
    }

    public void setComDiscount(String comDiscount) {
        this.comDiscount = comDiscount == null ? null : comDiscount.trim();
    }

    public String getComSellprice() {
        return comSellprice;
    }

    public void setComSellprice(String comSellprice) {
        this.comSellprice = comSellprice == null ? null : comSellprice.trim();
    }

    public String getComUnit() {
        return comUnit;
    }

    public void setComUnit(String comUnit) {
        this.comUnit = comUnit == null ? null : comUnit.trim();
    }

    public Integer getComCount() {
        return comCount;
    }

    public void setComCount(Integer comCount) {
        this.comCount = comCount;
    }

    public Integer getComRedline() {
        return comRedline;
    }

    public void setComRedline(Integer comRedline) {
        this.comRedline = comRedline;
    }

    public Integer getShelfId() {
        return shelfId;
    }

    public void setShelfId(Integer shelfId) {
        this.shelfId = shelfId;
    }
}