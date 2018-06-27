package com.drg0n20.springrecipeapp.converters;

import com.drg0n20.springrecipeapp.commands.UnitOfMeasureCommand;
import com.drg0n20.springrecipeapp.domain.UnitOfMeasure;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class UnitofMeasureToUnitOfMeasureCommand implements Converter<UnitOfMeasure, UnitOfMeasureCommand> {

    @Synchronized
    @Nullable
    @Override
    public UnitOfMeasureCommand convert(UnitOfMeasure source) {
        if (source == null) {
            return null;
        }

        final UnitOfMeasureCommand uomCommand = new UnitOfMeasureCommand();
        uomCommand.setId(source.getId());
        uomCommand.setDescription(source.getDescription());
        return uomCommand;
    }
}
