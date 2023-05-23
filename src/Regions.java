public enum Regions {
    CHUY("Ala Archa"),
    NARYN("Tash Rabat"),
    OSH("Sulaiman Too"),
    BATKEN("Oruk"),
    TALAS("Manas Ordo"),
    JALAL_ABAD("Arslanbap"),
    ISSYK_KOL("Issyk Kol lake");
    private String difference;

    Regions(String difference) {
        this.difference = difference;
    }

//    @Override                           //первый вариант
//    public String toString() {
//        return "Regions{" +
//                "difference='" + difference + '\'' +
//                "} " + super.toString();
//    }

    public String getDifference() {        //второй вариант
        return difference;

    }
}
