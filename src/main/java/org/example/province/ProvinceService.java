package org.example.province;

import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProvinceService implements IProvinceService {

    private final ProvinceRepository repository;

    @Override
    public Province save(Province category) {
        return repository.save(category);
    }

    @Override
    @Cacheable(value = "two",key = "#provinceId")
    public Province getById(Long id) {
        Optional<Province> optional = repository.findById(id);
        if(optional.isEmpty()){
            throw new RuntimeException("Not Found");
        }
        return optional.get();
    }

    @Override
    @Cacheable(value = "one")
    public List<Province> getAll() {
        return (List<Province>) repository.findAll();
    }

    @Override
    public void update(Province category) {
        Province newProvince = getById(category.getId());
        newProvince.setTitle(category.getTitle());
        repository.save(newProvince);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
