package org.example;

public class Notebooks {
    private String Brand;
    private Integer RAM;
    private Integer screenSize;
    private Double price;
    private String operatingSystem;
    private String processorModel;
    private Integer storageCapacity;



    public Notebooks(String brand, Integer RAM, Integer screenSize, Double price,
                     String operatingSystem, String processorModel,
                     Integer storageCapacity) {
        Brand = brand;
        this.RAM = RAM;
        this.screenSize = screenSize;
        this.price = price;
        this.operatingSystem = operatingSystem;
        this.processorModel = processorModel;
        this.storageCapacity = storageCapacity;

    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    public Integer getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }



}
