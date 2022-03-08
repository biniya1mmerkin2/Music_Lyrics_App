package com.example.recyclerviewexerecise;

public class DataModel {
    String viewname;
    String viewname2;



    public DataModel(String text,String text2)
    {
        viewname=text;
        viewname2=text2;

    }

    public String getViewname() {
        return viewname;
    }

    public String getViewname2() {
        return viewname2;
    }
    public void setViewname(String viewname) {
        this.viewname = viewname;
    }
}
