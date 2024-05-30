public class Address {

    // Metoda createAddress dla parametrow: kraj
    public String createAddress(String country) {
        return String.format("Country: %s", country);
    }

    // Metoda createAddress dla parametrow: kraj, miasto
    public String createAddress(String country, String city) {
        return String.format("Country: %s, City: %s", country, city);
    }

    // Metoda createAddress dla parametrow: kraj, miasto, kod pocztowy
    public String createAddress(String country, String city, String postalCode) {
        return String.format("Country: %s, City: %s, Postal Code: %s", country, city, postalCode);
    }

    // Metoda createAddress dla parametrow: kraj, miasto, kod pocztowy, nazwa ulicy
    public String createAddress(String country, String city, String postalCode, String street) {
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s", country, city, postalCode, street);
    }

    // Metoda createAddress dla parametrow: kraj, miasto, kod pocztowy, nazwa ulicy, numer mieszkania
    public String createAddress(String country, String city, String postalCode, String street, int houseNumber) {
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s, House Number: %d", country, city, postalCode, street, houseNumber);
    }

    public static void main(String[] args) {
        Address address = new Address();

        // Przyklady uzycia metody createAddress
        System.out.println(address.createAddress("Belarus"));
        System.out.println(address.createAddress("Belarus", "Minsk"));
        System.out.println(address.createAddress("Belarus", "Minsk", "141516"));
        System.out.println(address.createAddress("Belarus", "Minsk", "141516", "Petra Mstislauča"));
        System.out.println(address.createAddress("Belarus", "Minsk", "141516", "Petra Mstislauča", 3));
    }
}

