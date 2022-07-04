package com.company;

public class Flat {
    private int numberOfRooms;
    private int floors;
    private int floor;
    private int price;
    private String rayon;
    private String streat;
    private String houseNumber;

    public String getRayon() {
        return rayon;
    }

    public void setRayon(String rayon) {
        this.rayon = rayon;
    }

    public String getStreat() {
        return streat;
    }

    public void setStreat(String streat) {
        this.streat = streat;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    Flat(){};

    public Flat(int numberOfRooms, int floors, int floor, int price, String rayon, String streat, String houseNumber) {
        this.numberOfRooms = numberOfRooms;
        this.floors = floors;
        this.floor = floor;
        this.price = price;

        this.rayon = rayon;
        this.streat = streat;
        this.houseNumber = houseNumber;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString () {
        return "------------Квартиры----------- "
                + "\nЧисло комнат: " + numberOfRooms +"\nКоличество этажей: " + floors
                + "\nЭтаж квартиры: " + floor
                + "\nЦена: " + price
                + "\nРайон: " + rayon
                + "\nУлица: " + streat
                + "\nНомер дома: " + houseNumber;
    }
}
