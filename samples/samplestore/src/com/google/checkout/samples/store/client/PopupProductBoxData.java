// Copyright 2007 Google Inc. All Rights Reserved.

package com.google.checkout.samples.store.client;

import com.google.gwt.user.client.ui.*;


/**
 * Panel that lays out the data in the popup boxes when rolling over products.
 * 
 * @author Simon Lam (simonlam@google.com)
 */
public class PopupProductBoxData extends VerticalPanel {
  
  private Product product;
  
  public PopupProductBoxData(Product product) {
    try {
      this.setStyleName("popupProductBox");
      this.product = product;
      if (product.getImageUrl() != "")
        this.add(new Image(product.getImageUrl()));
      
      Label title = new Label(product.getTitle());
      title.setStyleName("title");
      this.add(title);

      Label description = new Label(product.getDescription());
      description.setStyleName("item-desc");
      this.add(description);
      
      Label price = new Label("$" + product.getPrice().toString());
      price.setStyleName("price");
      this.add(price);
      
      Button addToCart = new Button("Add to Cart");
      //Hyperlink addToCart = new Hyperlink("Add to Cart", "Recipes");
      addToCart.setStyleName("google-cart-add");
      this.add(addToCart);
   
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
