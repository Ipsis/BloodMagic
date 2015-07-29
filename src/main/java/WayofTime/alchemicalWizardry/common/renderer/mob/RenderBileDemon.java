package WayofTime.alchemicalWizardry.common.renderer.mob;

import WayofTime.alchemicalWizardry.common.entity.mob.EntityBileDemon;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderBileDemon extends RenderLiving
{
    private static final ResourceLocation field_110833_a = new ResourceLocation("alchemicalwizardry", "textures/models/BileDemon.png");

    public RenderBileDemon(ModelBase par1ModelBase, float par2)
    {
        super(Minecraft.getMinecraft().getRenderManager(), par1ModelBase, par2);
    }

    public ResourceLocation func_110832_a(EntityBileDemon par1EntityBileDemon)
    {
        return field_110833_a;
    }

    public ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.func_110832_a((EntityBileDemon) par1Entity);
    }
}