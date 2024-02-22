package net.yirmiri.excessive_building.init;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBParticlesTypes {
    public static final DefaultParticleType ANCIENT_PARTICLE = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(ExcessiveBuilding.MODID, "ancient_particle"), ANCIENT_PARTICLE);
    }
}
