package org.example.province;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("province/")
@AllArgsConstructor
public class ProvinceController {

    private final ProvinceService service;

    private final ProvinceMapper mapper;

    @PostMapping("v1")
    public ResponseEntity<Void> save(@RequestBody ProvinceDTO provinceDTO) {
        service.save(mapper.toProvince(provinceDTO));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("v1/{id}")
    public ResponseEntity<ProvinceDTO> getById(@PathVariable Long id) {
        Province province = service.getById(id);
        ProvinceDTO provinceDTO = mapper.toProvinceDTO(province);
        return ResponseEntity.ok(provinceDTO);
    }

    @GetMapping("v1/")
    public ResponseEntity<List<ProvinceDTO>> getAll() {
        List<Province> provinces = service.getAll();
        List<ProvinceDTO> provincesDTO = mapper.toProvinceDTOS(provinces);
        return ResponseEntity.ok(provincesDTO);
    }


    @DeleteMapping("/v1/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id)
    {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/v1")
    public ResponseEntity<Void> update(@RequestBody Province province)
    {
        service.update(province);
        return ResponseEntity.ok().build();
    }
}
