package com.xanplayz.pizza.items;

import com.xanplayz.pizza.registry.IHasModel;
import com.xanplayz.pizza.init.ItemInit;
import com.xanplayz.pizza.main.PizzaMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class Cheese extends ItemFood implements IHasModel
{



    public Cheese(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.FOOD);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    { PizzaMod.proxy.registerItemRenderer(this, 0, "inventory"); }
}
