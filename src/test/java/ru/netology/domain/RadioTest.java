package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldGetCurrentStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldMakeGetCurrentStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldMakeGetCurrentStationWithMinus() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
        radio.setCurrentStation(-8);
        assertEquals(8, radio.getCurrentStation());
    }


    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void shouldGetCurrentVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(7);
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetMoreCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
        radio.setCurrentVolume(15);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetLessCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(-10);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetMaxVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.getMaxVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetOverMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
        radio.getMaxVolume();
        assertEquals(10, radio.getCurrentVolume());
    }


    @Test
    public void shouldGetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        assertEquals(9, radio.getCurrentVolume());
        radio.getMinVolume();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetUnderMinVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.getMinVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
