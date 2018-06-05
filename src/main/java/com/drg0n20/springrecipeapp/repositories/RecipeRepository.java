package com.drg0n20.springrecipeapp.repositories;

import com.drg0n20.springrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
