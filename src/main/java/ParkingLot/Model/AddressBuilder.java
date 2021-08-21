package ParkingLot.Model;

public class AddressBuilder {

    private String city;
    private String country;
    private String state;

    public static AddressBuilder builder() {
        return new AddressBuilder();
    }

    public AddressBuilder city(String city) {
        this.city = city;
        return this;
    }


    public AddressBuilder country(String country) {
        this.country = country;
        return this;
    }

    public AddressBuilder state(String state) {
        this.state = state;
        return this;
    }

    public Address build() {
        Address address = new Address();
        address.setCity(city);
        address.setState(state);
        address.setCountry(country);
        return address;
    }
}
