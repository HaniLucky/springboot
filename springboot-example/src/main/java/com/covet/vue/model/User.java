package com.covet.vue.model;

public class User {
    private Integer nId;

    private String cName;

    private String cSex;

    private String cAge;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcSex() {
        return cSex;
    }

    public void setcSex(String cSex) {
        this.cSex = cSex == null ? null : cSex.trim();
    }

    public String getcAge() {
        return cAge;
    }

    public void setcAge(String cAge) {
        this.cAge = cAge == null ? null : cAge.trim();
    }
}