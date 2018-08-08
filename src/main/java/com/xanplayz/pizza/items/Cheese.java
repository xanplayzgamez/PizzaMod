package com.xanplayz.pizza.items;

import com.xanplayz.pizza.IHasModel;
import com.xanplayz.pizza.ItemInit;
import com.xanplayz.pizza.PizzaMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

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
