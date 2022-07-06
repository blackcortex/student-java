package org.example.address;

import lombok.AllArgsConstructor;
import org.example.user.IUserService;
import org.example.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AddressService implements IAddressService {

    private final AddressRepository repository;
    private final IUserService iUserService;

    @Override
    public Address save(Address address) {
        User user = iUserService.getById(address.getUser().getId());
        address.setUser(user);
        return repository.save(address);
    }

    @Override
    public Address getById(Long id) {
        Optional<Address> optional = repository.findById(id);
        if(optional.isEmpty()){
            throw new RuntimeException("Not Found");
        }
        return optional.get();
    }

    @Override
    public List<Address> getAll() {
        return (List<Address>) repository.findAll();
    }

    @Override
    public void update(Address address) {
        Address newAddress = getById(address.getId());
        repository.save(newAddress);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }


}
