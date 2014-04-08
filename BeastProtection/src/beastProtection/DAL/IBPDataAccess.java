package beastProtection.DAL;

import java.util.List;

import net.minecraft.world.chunk.Chunk;
import beastProtection.BPChunk;
import beastProtection.Claim;

public interface IBPDataAccess {

	public List<Claim> getClaimsForChunk(Chunk chunk);

	public BPChunk loadChunk(Chunk chunk);
	
	public boolean unloadChunk(BPChunk chunk);
	
	public boolean addClaim(Claim claim);
}
