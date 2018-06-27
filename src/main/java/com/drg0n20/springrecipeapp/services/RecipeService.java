package com.drg0n20.springrecipeapp.services;

import com.drg0n20.springrecipeapp.commands.RecipeCommand;
import com.drg0n20.springrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
