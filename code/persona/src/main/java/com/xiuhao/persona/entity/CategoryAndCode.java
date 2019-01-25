package com.xiuhao.persona.entity;

public class CategoryAndCode {
    private int id;
    private int category_l;
    private int category_m;
    private int category_s;
    private String category_name;
    private String explanation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory_s() {
        return category_s;
    }

    public void setCategory_s(int category_s) {
        this.category_s = category_s;
    }

    public int getCategory_m() {
        return category_m;
    }

    public void setCategory_m(int category_m) {
        this.category_m = category_m;
    }

    public int getCategory_l() {
        return category_l;
    }

    public void setCategory_l(int category_l) {
        this.category_l = category_l;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

}