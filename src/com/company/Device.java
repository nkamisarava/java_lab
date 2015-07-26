package com.company;

public abstract class Device {

    String model;

    abstract void manipulate();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
