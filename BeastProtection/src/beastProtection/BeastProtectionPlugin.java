package beastProtection;

import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = BeastProtection.MODID, version = BeastProtection.VERSION)
public class BeastProtectionPlugin {
	
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		
    }
	
	@EventHandler
	public void playerInteractHandler(PlayerInteractEvent event){

	}
}
