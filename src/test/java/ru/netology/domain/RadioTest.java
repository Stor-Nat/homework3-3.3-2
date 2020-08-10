package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldNext() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(5);
        radio.radioStationNext();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNext0() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(9);
        radio.radioStationNext();
        assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldPrev() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(5);
        radio.radioStationPrev();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPrev9() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(0);
        radio.radioStationPrev();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSoundPlus() {
        Radio radio = new Radio();
        radio.setMaxSound(10);
        radio.setCurrentSound(5);
        radio.soundPlus();
        assertEquals(6, radio.getCurrentSound());
    }

    @Test
    public void shouldNotSoundPlus() {
        Radio radio = new Radio();
        radio.setMaxSound(10);
        radio.setCurrentSound(10);
        radio.soundPlus();
        assertEquals(10, radio.getCurrentSound());
    }

    @Test
    public void shouldSoundMinus() {
        Radio radio = new Radio();
        radio.setMinSound(0);
        radio.setCurrentSound(5);
        radio.soundMinus();
        assertEquals(4, radio.getCurrentSound());
    }

    @Test
    public void shouldNotSoundMinus() {
        Radio radio = new Radio();
        radio.setMinSound(0);
        radio.setCurrentSound(0);
        radio.soundMinus();
        assertEquals(0, radio.getCurrentSound());
    }

}