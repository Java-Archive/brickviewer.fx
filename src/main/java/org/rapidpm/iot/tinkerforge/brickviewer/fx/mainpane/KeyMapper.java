package org.rapidpm.iot.tinkerforge.brickviewer.fx.mainpane;

import org.rapidpm.commons.cdi.registry.property.CDIPropertyRegistryService;
import org.rapidpm.commons.cdi.registry.property.PropertyRegistryService;

import javax.inject.Inject;

/**
 * Created by Sven Ruppert on 06.08.14.
 */
public class KeyMapper {

    private @Inject @CDIPropertyRegistryService
    PropertyRegistryService propertyRegistryService;


    public String map(String key) {
        return propertyRegistryService.getRessourceForKey("mainpane."+key);
    }

    public String mapDataSourcePane(String key) {
        return propertyRegistryService.getRessourceForKey("datasourcepane."+key);
    }



}
