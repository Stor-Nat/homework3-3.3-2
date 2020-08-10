package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldNext() {
        radio.setMaxRadioStation(20);
        radio.setCurrentRadioStation(10);
        radio.radioStationNext();
        assertEquals(20, radio.getMaxRadioStation());
        assertEquals(0, radio.getMinRadioStation());
        assertEquals(11, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNext0() {
        radio.setMaxRadioStation(10);
        radio.setCurrentRadioStation(10);
        radio.radioStationNext();
        assertEquals(10, radio.getMaxRadioStation());
        assertEquals(0, radio.getMinRadioStation());
        assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldPrev() {
        radio.setMaxRadioStation(20);
        radio.setCurrentRadioStation(10);
        radio.radioStationPrev();
        assertEquals(20, radio.getMaxRadioStation());
        assertEquals(0, radio.getMinRadioStation());
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPrev9() {
        radio.setMaxRadioStation(10);
        radio.setCurrentRadioStation(0);
        radio.radioStationPrev();
        assertEquals(10, radio.getMaxRadioStation());
        assertEquals(0, radio.getMinRadioStation());
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSoundPlus() {
        radio.setCurrentSound(5);
        radio.soundPlus();
        assertEquals(6, radio.getCurrentSound());
    }

    @Test
    public void shouldNotSoundPlus() {
        radio.setCurrentSound(100);
        radio.soundPlus();
        assertEquals(100, radio.getCurrentSound());
    }

    @Test
    public void shouldSoundMinus() {
        radio.setCurrentSound(40);
        radio.soundMinus();
        assertEquals(39, radio.getCurrentSound());
    }

    @Test
    public void shouldNotSoundMinus() {
        radio.setCurrentSound(0);
        radio.soundMinus();
        assertEquals(0, radio.getCurrentSound());
    }

}