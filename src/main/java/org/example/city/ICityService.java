package org.example.city;

import java.util.List;

public interface ICityService {

    City save(City product);

    City getById(Long id);

    List<City> getAll();

    void update(City product);

    void delete(Long id);

}
