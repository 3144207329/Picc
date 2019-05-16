package com.bdqn.pojo;

public class Department {
    private int did;
    private String dName;
    private int dlevel;
    private int superid;

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public int getDlevel() {
        return dlevel;
    }

    public void setDlevel(int dlevel) {
        this.dlevel = dlevel;
    }

    public int getSuperid() {
        return superid;
    }

    public void setSuperid(int superid) {
        this.superid = superid;
    }
}
