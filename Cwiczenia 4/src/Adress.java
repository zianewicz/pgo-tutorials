public class Address {

    // Metoda createAddress dla parametrów: kraj
    public String createAddress(String country) {
        return String.format("Country: %s", country);
    }

    // Metoda createAddress dla parametrów: kraj, miasto
    public String createAddress(String country, String city) {
        return String.format("Country: %s, City: %s", country, city);
    }

    // Metoda createAddress dla parametrów: kraj, miasto, kod pocztowy
    public String createAddress(String country, String city, String postalCode) {
        return String.format("Country: %s, City: %s, Postal Code: %s", country, city, postalCode);
    }

    // Metoda createAddress dla parametrów: kraj, miasto, kod pocztowy, nazwa ulicy
    public String createAddress(String country, String city, String postalCode, String street) {
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s", country, city, postalCode, street);
    }

    // Metoda createAddress dla parametrów: kraj, miasto, kod pocztowy, nazwa ulicy, numer mieszkania
    public String createAddress(String country, String city, String postalCode, String street, int houseNumber) {
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s, House Number: %d", country, city, postalCode, street, houseNumber);
    }

    public static void main(String[] args) {
        Address address = new Address();

        // Przykłady użycia metody createAddress
        System.out.println(address.createAddress("Poland"));
        System.out.println(address.createAddress("Poland", "Warsaw"));
        System.out.println(address.createAddress("Poland", "Warsaw", "00-001"));
        System.out.println(address.createAddress("Poland", "Warsaw", "00-001", "Krakowskie Przedmieście"));
        System.out.println(address.createAddress("Poland", "Warsaw", "00-001", "Krakowskie Przedmieście", 15));
    }
}

