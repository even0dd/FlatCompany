package com.company;

public class Flat {
    private int numberOfRooms;
    private int floors;
    private int floor;
    private int price;
    private Area area;
    private String streat;
    private String houseNumber;
    private Adres adres;

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

    public Flat(int numberOfRooms, int floors, int floor, int price, String streat, String houseNumber) {
        this.numberOfRooms = numberOfRooms;
        this.floors = floors;
        this.floor = floor;
        this.price = price;
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
                //+ "\nРайон: " + rayon
                + "\nУлица: " + streat
                + "\nНомер дома: " + houseNumber;
    }
    public enum Area {
        PERVOMAEVSKIY("Первомайский район "),
        OKTABRSKIY("Октябрьский район "),
        LENINSKIY("Ленинский район "),
        SVERDLOVSKIY("Свердловский район ");
        Area(String s){
            this.areaInRussia = s;
        }
        private String areaInRussia;
        public String getAreaInRussia() {
            return areaInRussia;
        }
    }

    enum AdresPERVOMAEVSKIY {
        ZhibekZholu("Жибек-Жолу"),
        Abdrakhmanova("Советская"),
        Akhunbaeva("Акхунбаева");
        AdresPERVOMAEVSKIY(String s) {
            this.adresInRussia = s;
        }
        private String adresInRussia;
        public String getAdresInRussia() {
            return adresInRussia;
        }
    }
    enum AdresOKTABRSKIY{
        BEBEEL("БИБИЛ"),
        BOTKINA("Боткина"),
        VOROVSKOY("Воровская");
        AdresOKTABRSKIY(String s) {
            this.adresInRussia = s;
        }
        private String adresInRussia;
        public String getAdresInRussia() {
            return adresInRussia;
        }
    }
    enum AdresLENINSKIY{
        Kazakova("Kaзакова"),
        Lumumba("Лумумба"),
        Kustanai("Кустанай");
        AdresLENINSKIY(String s) {
            this.adresInRussia = s;
        }
        private String adresInRussia;
        public String getAdresInRussia() {
            return adresInRussia;
        }
    }
    enum AdresSVERDLOVSKIY{
        AlexandraMatrosova("Александра Матросова"),
        AnatolyGladkov("Анатолий Гладков"),
        Queen("Королевская");
        AdresSVERDLOVSKIY(String s) {
            this.adresInRussia = s;
        }
        private String adresInRussia;
        public String getAdresInRussia() {
            return adresInRussia;
        }
    }
    public static void newMethod(Area area) {
        if(area.equals(Area.PERVOMAEVSKIY)) {
            private AdresPERVOMAEVSKIY streat = AdresPERVOMAEVSKIY;
        }
    }
}
