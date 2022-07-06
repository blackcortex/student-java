package org.example.address;

import org.springframework.data.domain.Page;

import java.util.List;

public interface IAddressService {

    Address save(Address user);

    Address getById(Long id);

    List<Address> getAll();

    void update(Address user);

    void delete(Long id);

//    Page<Address> getAllWithPage(int page, int pageSize);

}
