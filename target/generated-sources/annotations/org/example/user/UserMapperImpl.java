package org.example.user;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-06T21:04:21+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18-ea (Private Build)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDTO.getId() );
        user.setVersion( userDTO.getVersion() );
        user.setCreatedDate( userDTO.getCreatedDate() );
        user.setCreatedBy( userDTO.getCreatedBy() );
        user.setLastModifiedDate( userDTO.getLastModifiedDate() );
        user.setLastModifiedBy( userDTO.getLastModifiedBy() );
        user.setName( userDTO.getName() );
        user.setLastName( userDTO.getLastName() );
        user.setFatherName( userDTO.getFatherName() );
        user.setNationalCode( userDTO.getNationalCode() );
        user.setBirthPlace( userDTO.getBirthPlace() );
        if ( userDTO.getBlood() != null ) {
            user.setBlood( Enum.valueOf( BloodEnum.class, userDTO.getBlood() ) );
        }

        return user;
    }

    @Override
    public UserDTO toUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setVersion( user.getVersion() );
        userDTO.setCreatedDate( user.getCreatedDate() );
        userDTO.setCreatedBy( user.getCreatedBy() );
        userDTO.setLastModifiedDate( user.getLastModifiedDate() );
        userDTO.setLastModifiedBy( user.getLastModifiedBy() );
        userDTO.setName( user.getName() );
        userDTO.setLastName( user.getLastName() );
        userDTO.setFatherName( user.getFatherName() );
        userDTO.setNationalCode( user.getNationalCode() );
        userDTO.setBirthPlace( user.getBirthPlace() );
        if ( user.getBlood() != null ) {
            userDTO.setBlood( user.getBlood().name() );
        }

        return userDTO;
    }

    @Override
    public List<UserDTO> toUserDTOS(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( users.size() );
        for ( User user : users ) {
            list.add( toUserDTO( user ) );
        }

        return list;
    }

    @Override
    public List<User> toUsers(List<UserDTO> userDTOS) {
        if ( userDTOS == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( userDTOS.size() );
        for ( UserDTO userDTO : userDTOS ) {
            list.add( toUser( userDTO ) );
        }

        return list;
    }
}
