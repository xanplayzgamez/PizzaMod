package com.xanplayz.pizza;



import com.xanplayz.pizza.blocks.Pizza;
import com.xanplayz.pizza.items.Cheese;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item CHEESE = new Cheese("cheese", 4, 0.2F, false);
}
