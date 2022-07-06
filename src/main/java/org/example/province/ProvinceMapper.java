package org.example.province;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProvinceMapper {


    Province toProvince(ProvinceDTO provinceDTO);

    ProvinceDTO toProvinceDTO(Province province);


    List<ProvinceDTO> toProvinceDTOS(List<Province> provinces);

    List<Province> toProvinces(List<ProvinceDTO> provinceDTOS);


}
