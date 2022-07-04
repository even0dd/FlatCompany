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

