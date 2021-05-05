package ru.netology.domain;

public class Radio {
    int currentStation;
    int maxStation = 9;
    int minStation = 0;

    int currentVolume;
    int maxVolume = 10;
    int minVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void nextStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else {
            this.currentStation = currentStation + 1;
        }

    }


    public void prevStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else {
            this.currentStation = currentStation - 1;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void getMaxVolume() {
        if (currentVolume >= maxVolume) {
            return;
        } else currentVolume = currentVolume + 1;
    }


    public void getMinVolume() {
        if (currentVolume <= minVolume) {
            return;
        } else currentVolume = currentVolume - 1;
    }
}


















