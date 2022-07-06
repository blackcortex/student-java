package org.example.address;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.example.user.User;
import org.example.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-06T21:04:21+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18-ea (Private Build)"
)
@Component
public class AddressMapperImpl implements AddressMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Address toAddress(AddressDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        String context = null;
        User user = null;

        context = userDTO.getContext();
        user = userMapper.toUser( userDTO.getUser() );

        Address address = new Address( context, user );

        address.setId( userDTO.getId() );
        address.setVersion( userDTO.getVersion() );
        address.setCreatedDate( userDTO.getCreatedDate() );
        address.setCreatedBy( userDTO.getCreatedBy() );
        address.setLastModifiedDate( userDTO.getLastModifiedDate() );
        address.setLastModifiedBy( userDTO.getLastModifiedBy() );

        return address;
    }

    @Override
    public AddressDTO toAddressDTO(Address user) {
        if ( user == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setId( user.getId() );
        addressDTO.setVersion( user.getVersion() );
        addressDTO.setCreatedDate( user.getCreatedDate() );
        addressDTO.setCreatedBy( user.getCreatedBy() );
        addressDTO.setLastModifiedDate( user.getLastModifiedDate() );
        addressDTO.setLastModifiedBy( user.getLastModifiedBy() );
        addressDTO.setContext( user.getContext() );
        addressDTO.setUser( userMapper.toUserDTO( user.getUser() ) );

        return addressDTO;
    }

    @Override
    public List<AddressDTO> toAddressesDTO(List<Address> users) {
        if ( users == null ) {
            return null;
        }

        List<AddressDTO> list = new ArrayList<AddressDTO>( users.size() );
        for ( Address address : users ) {
            list.add( toAddressDTO( address ) );
        }

        return list;
    }

    @Override
    public List<Address> toAddresses(List<AddressDTO> userDTOS) {
        if ( userDTOS == null ) {
            return null;
        }

        List<Address> list = new ArrayList<Address>( userDTOS.size() );
        for ( AddressDTO addressDTO : userDTOS ) {
            list.add( toAddress( addressDTO ) );
        }

        return list;
    }
}
