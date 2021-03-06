package org.sse.priceservice.model;

import lombok.Data;

/**
 * @author HPY
 */
@Data
public class RecipeHasStyle {

  private long recipeId;
  private long styleId;


  public long getRecipeId() {
    return recipeId;
  }

  public void setRecipeId(long recipeId) {
    this.recipeId = recipeId;
  }


  public long getStyleId() {
    return styleId;
  }

  public void setStyleId(long styleId) {
    this.styleId = styleId;
  }

}
