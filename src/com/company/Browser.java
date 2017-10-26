package com.company;

import java.util.ArrayList;

public class Browser {

    private String browserTitle;
    private ArrayList<Tab> tabArrayList;

    public Browser() {
        tabArrayList = new ArrayList<Tab>();

    }

    public String getBrowserTitle() {
        return browserTitle;
    }

    public void setBrowserTitle(String browserTitle) {
        this.browserTitle = browserTitle;
    }

    public ArrayList<Tab> getTabArrayList() {
        return tabArrayList;
    }

    public void setTabArrayList(ArrayList<Tab> tabArrayList) {
        this.tabArrayList = tabArrayList;
    }
}
