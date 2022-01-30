/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccounthierarchy;

/**
 *
 * @author kinner
 */
public class Address {
    String street;
    String city;
    String state;
    String zipcode;

    public Address(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return this.street;
    }
    public String getCity() {
        return this.city;
    }
    public String getState() {
        return this.state;
    }
    public String getZipcode() {
        return this.zipcode;
    }

    @Override
    public String toString() {
        return "\n    " + street + "\n" +
               "    " + city + ", " + state + " " + zipcode + "\n";
    }
}
