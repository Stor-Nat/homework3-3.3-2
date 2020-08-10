package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int id;
    private int minRadioStation = 0;
    private int maxRadioStation = 20;
    private int currentRadioStation;

    private int minSound = 0;
    private int maxSound = 100;
    private int currentSound = (minSound + maxSound) / 2;


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