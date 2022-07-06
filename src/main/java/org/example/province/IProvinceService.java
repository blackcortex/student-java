package org.example.province;

import java.util.List;

public interface IProvinceService {

    Province save(Province category);

    Province getById(Long id);

    List<Province> getAll();

    void update(Province category);

    void delete(Long id);

}
