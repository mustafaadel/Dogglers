package com.example.dogglers;

import android.graphics.Bitmap;

public class Dogs {
  private String item_dog_name;
  private String item_dog_age;
  String item_dog_hobbies;
  int itemImage;



  public Dogs(String item_dog_name, String item_dog_age, String item_dog_hobbies, int itemImage) {
    this.item_dog_name = item_dog_name;
    this.item_dog_age = item_dog_age;
    this.item_dog_hobbies = item_dog_hobbies;
    this.itemImage = itemImage;
  }

  public String getItem_dog_name() {
    return item_dog_name;
  }

  public void setItem_dog_name(String item_dog_name) {
    this.item_dog_name = item_dog_name;
  }

  public String getItem_dog_age() {
    return item_dog_age;
  }

  public void setItem_dog_age(String item_dog_age) {
    this.item_dog_age = item_dog_age;
  }

  public String getItem_dog_hobbies() {
    return item_dog_hobbies;
  }

  public void setItem_dog_hobbies(String item_dog_hobbies) {
    this.item_dog_hobbies = item_dog_hobbies;
  }

  public int getItemImage() {
    return itemImage;
  }

  public void setItemImage(int itemImage) {
    this.itemImage = itemImage;
  }
}
