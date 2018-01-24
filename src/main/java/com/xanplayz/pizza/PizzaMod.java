package com.xanplayz.pizza;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PizzaMod.MODID, name = PizzaMod.NAME, version = PizzaMod.VERSION)
public class PizzaMod {
	

    @SidedProxy(clientSide = PizzaMod.CLIENT, serverSide = PizzaMod.COMMON)
    public static CommonProxy proxy;
    
	public static final String MODID = "pizza";
	public static final String NAME = "Pizza Mod";
	public static final String VERSION = "1.0";
	public static final String CLIENT = "com.xanplayz.pizza.ClientProxy";
	public static final String COMMON = "com.xanplayz.pizza.CommonProxy";



}
