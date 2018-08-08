package com.xanplayz.pizza.main;

import com.xanplayz.pizza.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = PizzaMod.MODID, name = PizzaMod.NAME, version = PizzaMod.VERSION)
public class PizzaMod {
	

    @SidedProxy(clientSide = PizzaMod.CLIENT, serverSide = PizzaMod.COMMON)
    public static CommonProxy proxy;
    
	public static final String MODID = "pizza";
	public static final String NAME = "PizzaMod";
	public static final String VERSION = "1.1b";
	public static final String CLIENT = "com.xanplayz.pizza.proxy.ClientProxy";
	public static final String COMMON = "com.xanplayz.pizza.proxy.CommonProxy";



}
