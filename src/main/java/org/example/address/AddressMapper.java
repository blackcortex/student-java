package org.example.address;

import org.example.user.UserMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring",uses = {UserMapper.class})
public interface AddressMapper {

    Address toAddress(AddressDTO userDTO);

    AddressDTO toAddressDTO(Address user);


    List<AddressDTO> toAddressesDTO(List<Address> users);

    List<Address> toAddresses(List<AddressDTO> userDTOS);


}
