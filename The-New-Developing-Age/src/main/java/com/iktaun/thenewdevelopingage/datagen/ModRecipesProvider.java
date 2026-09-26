package com.iktaun.thenewdevelopingage.datagen;

import com.iktaun.thenewdevelopingage.block.Modblocks;
import com.iktaun.thenewdevelopingage.item.Moditems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipesProvider(PackOutput pOutput) {
        super(pOutput);
    }


    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,Modblocks.MAGNET_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#',Moditems.MAGNET_INGOT.get())
                .unlockedBy(getHasName(Moditems.MAGNET_INGOT.get()),has(Moditems.MAGNET_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,Modblocks.COLOURED_MAGNET_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#',Moditems.COLOURED_MAGNET_INGOT.get())
                .unlockedBy(getHasName(Moditems.COLOURED_MAGNET_INGOT.get()),has(Moditems.COLOURED_MAGNET_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Moditems.UNINFORMATIVE_BLUE_TICKET.get())
                .pattern("bbb")
                .pattern("PPP")
                .pattern("BBB")
                .define('b', Items.BLUE_DYE)
                .define('P',Items.PAPER)
                .define('B',Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.PAPER), has(Items.PAPER))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Moditems.UNINFORMATIVE_RED_TICKET.get())
                .pattern("RRR")
                .pattern("PPP")
                .pattern("BBB")
                .define('R', Items.RED_DYE)
                .define('P',Items.PAPER)
                .define('B',Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.PAPER), has(Items.PAPER))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Moditems.MAGNET_INGOT.get(),9)
                .requires(Modblocks.MAGNET_BLOCK.get())
                .unlockedBy(getHasName(Modblocks.MAGNET_BLOCK.get()),has(Modblocks.MAGNET_BLOCK.get()))
                .save(pWriter, "magnet_ingot_come_from_magnet_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Moditems.COLOURED_MAGNET_INGOT.get(),9)
                .requires(Modblocks.COLOURED_MAGNET_BLOCK.get())
                .save(pWriter, "coloured_magnet_ingot_come_from_coloured_magnet_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Moditems.COLOURED_MAGNET_INGOT.get())
                .requires(Items.BLUE_DYE)
                .requires(Moditems.MAGNET_INGOT.get())
                .requires(Items.RED_DYE)
                .unlockedBy(getHasName(Moditems.MAGNET_INGOT.get()),has(Moditems.MAGNET_INGOT.get()))
                .save(pWriter, "coloured_magnet_ingot_come_from_magnet_ingot");

    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                    pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
