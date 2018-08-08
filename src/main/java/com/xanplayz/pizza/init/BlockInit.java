package com.xanplayz.pizza.init;

import com.xanplayz.pizza.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLOCK_PIZZA = new Pizza("block_pizza", Material.CAKE);



}
