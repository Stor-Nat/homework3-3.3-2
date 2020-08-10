package ru.netology.domain;

public class Radio {
    private int id;
    private int minRadioStation = 0;
    private int maxRadioStation = 20;
    private int currentRadioStation;

    private int minSound = 0;
    private int maxSound = 100;
    private int currentSound = (minSound + maxSound) / 2;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentSound(int currentSound) {
        this.currentSound = currentSound;
    }

    public int getMinSound() {
        return minSound;
    }

    public void setMinSound(int minSound) {
        this.minSound = minSound;
    }

    public int getMaxSound() {
        return maxSound;
    }

    public void setMaxSound(int maxSound) {
        this.maxSound = maxSound;
    }


    public void radioStationNext() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation += 1;
        }
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void radioStationPrev() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void soundPlus() {
        if (currentSound == maxSound) {
            return;
        }
        currentSound = currentSound + 1;
        this.currentSound = currentSound;
    }

    public void soundMinus() {
        if (currentSound == minSound) {
            return;
        }
        currentSound = currentSound - 1;
        this.currentSound = currentSound;
    }

}