package com.example.recipedipanshu;

public class model1 {

     String recipename ,recipeimage;

    public model1() { }

    public model1(String recipename, String recipeimage) {
        this.recipename = recipename;
        this.recipeimage = recipeimage;
    }

    public String getRecipename() {
        return recipename;
    }

    public void setRecipename(String recipename) {
        this.recipename = recipename;
    }

    public String getRecipeimage() {
        return recipeimage;
    }

    public void setRecipeimage(String recipeimage) {
        this.recipeimage = recipeimage;
    }
}

