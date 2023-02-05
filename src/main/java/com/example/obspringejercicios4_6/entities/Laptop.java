package com.example.obspringejercicios4_6.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String model;

    String manufacturer;
    String cpu;
    String storageSSD;
    String storageRAM;
    String gpu;
    LocalDate releaseDate;
    Boolean available;



    public Laptop(){

    }

    public Laptop(Long id, String model, String manufacturer, String cpu, String storageSSD,String storageRAM, String gpu, LocalDate releaseDate, Boolean available) {
        this.id = id;
        this.model = model;
        this.manufacturer = manufacturer;
        this.cpu = cpu;
        this.storageSSD = storageSSD;
        this.storageRAM = storageRAM;
        this.gpu = gpu;
        this.releaseDate = releaseDate;
        this.available = available;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getStorageSSD() {
        return storageSSD;
    }

    public String getStorageRAM() {
        return storageRAM;
    }

    public void setStorageRAM(String storageRAM) {
        this.storageRAM = storageRAM;
    }

    public void setStorageSSD(String storageSSD) {
        this.storageSSD = storageSSD;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
