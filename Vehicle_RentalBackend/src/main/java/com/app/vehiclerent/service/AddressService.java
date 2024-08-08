package com.app.vehiclerent.service;

import java.util.List;

import com.app.vehiclerent.entity.Address;

public interface AddressService {
    List<Address> getAllAddresses();

    Address getAddressById(Long id);

    Address createAddress(Address address);

    Address updateAddress(Long id, Address address);

    void deleteAddress(Long id);
}
