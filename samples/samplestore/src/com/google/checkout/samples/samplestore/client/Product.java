// Copyright 2007 Google Inc. All Rights Reserved.

package com.google.checkout.samples.samplestore.client;

/**
 * A model object representing a product.
 * 
 * @author Simon Lam (simonlam@google.com)
 */
public class Product {

  private static final String DEFAULT_IMAGE = "images/no_image.gif";
  
  private final String id;
  private final String title;
  private final String imageUrl;
  private final String description;
  private final double price;
  
  public Product(String id, String title, String imageUrl, String description, 
      double price) {
    this.id = id;
    this.title = title;
    this.imageUrl = (imageUrl != "" ? imageUrl : DEFAULT_IMAGE);
    this.description = description;
    this.price = price;
  }
  
  public String getId() {
    return id;
  }
  
  public String getTitle() {
    return title;
  }
  
  public String getImageUrl() {
    return imageUrl;
  }
  
  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }
  
  public String getPriceAsString() {
    String displayPrice = String.valueOf(price);
    int index = displayPrice.indexOf(".");
    
    if (index < 0) {
      // price is in the form 33
      return "$" + price + ".00";
    } else if (index == 0) {
      // price is in the form .33
      return "$0" + price;
    } else if (index == (displayPrice.length() - 1)) {
      // price is in the form 33.
      return "$" + price + "00";
    } else if (displayPrice.substring(index).length() == 2) {
      // price is in the form 33.3
      return "$" + price + "0";
    } else {
      // append a $ to the beginning
      return "$" + price;
    }
  }
  
  public String toString() {
    return title + ", " + description + ", " + price;
  }
}