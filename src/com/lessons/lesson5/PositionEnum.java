package com.lessons.lesson5;

public enum PositionEnum {

    DIRECTOR (3), WORKER (2);

    private int koef;

    PositionEnum(int koef) {
        this.koef = koef;
    }

    public int getKoef() {
        return koef;
    }
}
