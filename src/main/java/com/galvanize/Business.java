package com.galvanize;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by jackpantalena on 7/25/18.
 */
public class Business implements Addressable {

    private String name;
    private ArrayList<Address> addresses;

    public Business(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public void addAddress(Address address) {
        if (addresses == null) {
            addresses = new ArrayList<>();
            addresses.add(address);
        }
        addresses.add(address);
    }
}
