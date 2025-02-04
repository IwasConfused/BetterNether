package org.betterx.betternether.blocks;

import org.betterx.bclib.blocks.BaseDoorBlock;
import org.betterx.bclib.interfaces.TagProvider;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;

public class BNWoodlikeDoor extends BaseDoorBlock.Wood implements TagProvider {

    public BNWoodlikeDoor(Block source, WoodType type) {
        super(source, type.setType());
    }

    public BNWoodlikeDoor(Properties properties, WoodType type) {
        super(properties, type.setType());
    }

}
