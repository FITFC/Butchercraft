package com.lance5057.butchercraft.armor;

import com.lance5057.butchercraft.armor.models.BunnyEarsModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import java.util.function.Consumer;

public class BunnyEarsItem extends TemptArmor {
	public BunnyEarsItem(ArmorMaterial pMaterial, Properties pProperties) { 
		super(pMaterial, Type.HELMET, pProperties);
	}

	@Override
	public void initializeClient(Consumer<IClientItemExtensions> consumer) {
		consumer.accept(new IClientItemExtensions() {

			@Override
			public HumanoidModel<?> getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot,
					HumanoidModel<?> defaultModel) {
				EntityModelSet models = Minecraft.getInstance().getEntityModels();
				ModelPart root = models.bakeLayer(BunnyEarsModel.LAYER_LOCATION);
				return new BunnyEarsModel(root);
			}

		});
	}

}
