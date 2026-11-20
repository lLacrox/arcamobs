package net.lacrox.arcamobs.list;

import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;

public class ModProperties extends Properties {
    public static final IntProperty SEASHELL_AMOUNT = IntProperty.of("seashell_amount", 1, 4);
}
