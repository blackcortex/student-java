package org.example.city;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("city/")
@AllArgsConstructor
public class CityController {

    private final CityService service;

    private final CityMapper mapper;

    @PostMapping("v1")
    public ResponseEntity<Void> save(@RequestBody CityDTO cityDTO) {
        service.save(mapper.toCity(cityDTO));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("v1/{id}")
    public ResponseEntity<CityDTO> getById(@PathVariable Long id) {
        City city = service.getById(id);
        CityDTO cityDTO = mapper.toCityDTO(city);
        return ResponseEntity.ok(cityDTO);
    }

    @GetMapping("v1/")
    public ResponseEntity<List<CityDTO>> getAll() {
        List<City> cities = service.getAll();
        List<CityDTO> citiesDTO = mapper.toCityDTOS(cities);
        return ResponseEntity.ok(citiesDTO);
    }


    @DeleteMapping("/v1/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id)
    {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/v1")
    public ResponseEntity<Void> update(@RequestBody City city)
    {
        service.update(city);
        return ResponseEntity.ok().build();
    }
}
