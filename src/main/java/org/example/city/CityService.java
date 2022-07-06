package org.example.city;

import lombok.AllArgsConstructor;
import org.example.province.Province;
import org.example.province.IProvinceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CityService implements ICityService {

    private final CityRepository repository;

    private final IProvinceService service;

    @Override
    public City save(City city) {
        Province province = service.getById(city.getProvince().getId());
        city.setProvince(province);
        return repository.save(city);
    }

    @Override
    public City getById(Long id) {
        Optional<City> optional = repository.findById(id);
        if(optional.isEmpty()){
            throw new RuntimeException("Not Found");
        }
        return optional.get();
    }

    @Override
    public List<City> getAll() {
        return (List<City>) repository.findAll();
    }

    @Override
    public void update(City city) {
        City newCity = getById(city.getId());
        Province province = service.getById(city.getProvince().getId());
        newCity.setProvince(province);
        newCity.setTitle(city.getTitle());
        repository.save(newCity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
