package org.example.city;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.example.province.ProvinceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-06T21:04:20+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18-ea (Private Build)"
)
@Component
public class CityMapperImpl implements CityMapper {

    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public City toCity(CityDTO cityDTO) {
        if ( cityDTO == null ) {
            return null;
        }

        City city = new City();

        city.setId( cityDTO.getId() );
        city.setVersion( cityDTO.getVersion() );
        city.setCreatedDate( cityDTO.getCreatedDate() );
        city.setCreatedBy( cityDTO.getCreatedBy() );
        city.setLastModifiedDate( cityDTO.getLastModifiedDate() );
        city.setLastModifiedBy( cityDTO.getLastModifiedBy() );
        city.setTitle( cityDTO.getTitle() );
        city.setProvince( provinceMapper.toProvince( cityDTO.getProvince() ) );

        return city;
    }

    @Override
    public CityDTO toCityDTO(City city) {
        if ( city == null ) {
            return null;
        }

        CityDTO cityDTO = new CityDTO();

        cityDTO.setId( city.getId() );
        cityDTO.setVersion( city.getVersion() );
        cityDTO.setCreatedDate( city.getCreatedDate() );
        cityDTO.setCreatedBy( city.getCreatedBy() );
        cityDTO.setLastModifiedDate( city.getLastModifiedDate() );
        cityDTO.setLastModifiedBy( city.getLastModifiedBy() );
        cityDTO.setTitle( city.getTitle() );
        cityDTO.setProvince( provinceMapper.toProvinceDTO( city.getProvince() ) );

        return cityDTO;
    }

    @Override
    public List<CityDTO> toCityDTOS(List<City> cities) {
        if ( cities == null ) {
            return null;
        }

        List<CityDTO> list = new ArrayList<CityDTO>( cities.size() );
        for ( City city : cities ) {
            list.add( toCityDTO( city ) );
        }

        return list;
    }

    @Override
    public List<City> toCategories(List<CityDTO> cityDTOS) {
        if ( cityDTOS == null ) {
            return null;
        }

        List<City> list = new ArrayList<City>( cityDTOS.size() );
        for ( CityDTO cityDTO : cityDTOS ) {
            list.add( toCity( cityDTO ) );
        }

        return list;
    }
}
