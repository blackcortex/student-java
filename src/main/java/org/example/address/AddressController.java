package org.example.address;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address/")
@AllArgsConstructor
public class AddressController {

    private final AddressService addressService;

    private final AddressMapper addressMapper;

    @PostMapping("v1")
    public ResponseEntity<Void> save(@RequestBody AddressDTO addressDTO) {
        addressService.save(addressMapper.toAddress(addressDTO));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("v1/{id}")
    public ResponseEntity<AddressDTO> getById(@PathVariable Long id) {
        Address address = addressService.getById(id);
        AddressDTO addressDTO = addressMapper.toAddressDTO(address);
        return ResponseEntity.ok(addressDTO);
    }

    @GetMapping("v1/")
    public ResponseEntity<List<AddressDTO>> getAll() {
        List<Address> addresses = addressService.getAll();
        List<AddressDTO> addressesDTO = addressMapper.toAddressesDTO(addresses);
        return ResponseEntity.ok(addressesDTO);
    }


    @DeleteMapping("/v1/{id}")
    public ResponseEntity deleteById(@PathVariable Long id)
    {
        addressService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/v1")
    public ResponseEntity update(@RequestBody Address address)
    {
        addressService.update(address);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("v1/{page}/{size}")
//    public ResponseEntity<PaginationDTO> getAllWithPage(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
//
//        Page<Address> bankPage = addressService.getAllWithPage(page, size);
//        int totalPage = bankPage.getTotalPages();
//        Long totalElement = bankPage.getTotalElements();
//
//        List<Address> addresss = bankPage.getContent();
//
//
//        List<AddressDTO> addresssDTO = addressMapper.toAddressDTOS(addresss);
//
//        PaginationDTO<AddressDTO> paginationDTO = new PaginationDTO<>(totalElement, totalPage, addresssDTO);
//
//
//        return ResponseEntity.ok(paginationDTO);
//    }


}
