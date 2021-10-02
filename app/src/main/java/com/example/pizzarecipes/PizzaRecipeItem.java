package com.example.pizzarecipes;

public class PizzaRecipeItem {

    private final int imageResource;
    private final String title;
    private final String description;
    private final String recipe;


    public PizzaRecipeItem(int imageResource, String title, String description, String recipe) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
        this.recipe = recipe;
    }

    public String getRecipe() {
        return recipe;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
