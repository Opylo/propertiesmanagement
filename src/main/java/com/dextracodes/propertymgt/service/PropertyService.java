package com.dextracodes.propertymgt.service;

import com.dextracodes.propertymgt.model.PropertyDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PropertyService {

    PropertyDTO saveProperty(PropertyDTO propertyDTO);
    List<PropertyDTO> getAllProperties();
    PropertyDTO updateProperty(PropertyDTO propertyDTO, Long propertyId);
    PropertyDTO updatePropertyDecription(@RequestBody PropertyDTO propertyDTO, Long propertyId);
    PropertyDTO updatePropertyPrice(@RequestBody PropertyDTO propertyDTO, Long propertyId);
    void deleteProperty(Long propertyId);

}
