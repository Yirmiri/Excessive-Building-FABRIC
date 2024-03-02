package net.yirmiri.excessive_building.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractClientPlayerEntity.class)
public abstract class AbstractClientPlayerMixin extends PlayerEntity {
	public AbstractClientPlayerMixin(World world, BlockPos pos, float v, GameProfile profile) {
		super(world, pos, v, profile);
	}

	@Inject(method = "getCloakTextureLocation", at = @At(value = "HEAD"), cancellable = true)
	public void getCloakTextureLocation(CallbackInfoReturnable<Identifier> cir) {
		String username = this.getDisplayName().getString();
		if (ExcessiveBuilding.AZURUNE.contains(username)) cir.setReturnValue(new Identifier(ExcessiveBuilding.MODID, "textures/capes/azurune.png"));
		if (ExcessiveBuilding.UK_UA_TRANSLATORS.contains(username)) cir.setReturnValue(new Identifier(ExcessiveBuilding.MODID, "textures/capes/eb_contributors_uk_ua.png"));
		if (ExcessiveBuilding.CONTRIBUTORS.contains(username)) cir.setReturnValue(new Identifier(ExcessiveBuilding.MODID, "textures/capes/eb_contributors.png"));
		if (ExcessiveBuilding.SUPPORTERS.contains(username)) cir.setReturnValue(new Identifier(ExcessiveBuilding.MODID, "textures/capes/eb_supporters.png"));
	}
}
