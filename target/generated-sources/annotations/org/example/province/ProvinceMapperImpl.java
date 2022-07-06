package org.example.province;

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
public class ProvinceMapperImpl implements ProvinceMapper {

    @Override
    public Province toProvince(ProvinceDTO provinceDTO) {
        if ( provinceDTO == null ) {
            return null;
        }

        Province province = new Province();

        province.setId( provinceDTO.getId() );
        province.setVersion( provinceDTO.getVersion() );
        province.setCreatedDate( provinceDTO.getCreatedDate() );
        province.setCreatedBy( provinceDTO.getCreatedBy() );
        province.setLastModifiedDate( provinceDTO.getLastModifiedDate() );
        province.setLastModifiedBy( provinceDTO.getLastModifiedBy() );
        province.setTitle( provinceDTO.getTitle() );

        return province;
    }

    @Override
    public ProvinceDTO toProvinceDTO(Province province) {
        if ( province == null ) {
            return null;
        }

        ProvinceDTO provinceDTO = new ProvinceDTO();

        provinceDTO.setId( province.getId() );
        provinceDTO.setVersion( province.getVersion() );
        provinceDTO.setCreatedDate( province.getCreatedDate() );
        provinceDTO.setCreatedBy( province.getCreatedBy() );
        provinceDTO.setLastModifiedDate( province.getLastModifiedDate() );
        provinceDTO.setLastModifiedBy( province.getLastModifiedBy() );
        provinceDTO.setTitle( province.getTitle() );

        return provinceDTO;
    }

    @Override
    public List<ProvinceDTO> toProvinceDTOS(List<Province> provinces) {
        if ( provinces == null ) {
            return null;
        }

        List<ProvinceDTO> list = new ArrayList<ProvinceDTO>( provinces.size() );
        for ( Province province : provinces ) {
            list.add( toProvinceDTO( province ) );
        }

        return list;
    }

    @Override
    public List<Province> toProvinces(List<ProvinceDTO> provinceDTOS) {
        if ( provinceDTOS == null ) {
            return null;
        }

        List<Province> list = new ArrayList<Province>( provinceDTOS.size() );
        for ( ProvinceDTO provinceDTO : provinceDTOS ) {
            list.add( toProvince( provinceDTO ) );
        }

        return list;
    }
}
