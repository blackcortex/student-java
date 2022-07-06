package org.example.city;

import org.example.category.CategoryMapper;
import org.example.province.ProvinceMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ProvinceMapper.class})
public interface CityMapper {


    City toCity(CityDTO cityDTO);

    CityDTO toCityDTO(City city);


    List<CityDTO> toCityDTOS(List<City> cities);

    List<City> toCategories(List<CityDTO> cityDTOS);


}
