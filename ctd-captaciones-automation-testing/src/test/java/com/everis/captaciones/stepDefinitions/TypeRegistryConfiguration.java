package com.everis.captaciones.stepDefinitions;

import com.everis.captaciones.models.CustomerData;
import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

import java.util.Locale;
import java.util.Map;

import static java.util.Locale.ENGLISH;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {
    @Override
    public Locale locale() {
        return ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        TableEntryTransformer<CustomerData> transformer = new TableEntryTransformer<CustomerData>() {
            @Override
            public CustomerData transform(Map<String, String> entry) throws Throwable {
                return new CustomerData(entry.get("codigo"), entry.get("cuenta"));
            }
        };
        DataTableType dataTableType = new DataTableType(CustomerData.class, transformer);

        typeRegistry.defineDataTableType(dataTableType);
    }
}
