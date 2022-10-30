package e.procedure;

import net.minecraft.entity.Entity;

import java.util.Map;

import e.ElementsCocMod;

@ElementsCocMod.ModElement.Tag
public class ProcedureFlameThrowerBulletHitsLivingEntity extends ElementsCocMod.ModElement {
	public ProcedureFlameThrowerBulletHitsLivingEntity(ElementsCocMod instance) {
		super(instance, 1);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FlameThrowerBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 10);
	}
}
