package com.kingcolton1.blockelevator;

import com.fox2code.foxloader.loader.ServerMod;

import net.minecraft.src.game.block.Block;
import net.minecraft.src.game.block.Material;

public class BlockElevatorServer extends BlockElevator implements ServerMod {
    @Override
    public void onInit() {
        System.out.println("BlockElevator initialized");
        Block.blocksList[41] = null;
        Block.blocksList[41] = new BlockElevatorFunc(41, Material.iron);
    }
}
