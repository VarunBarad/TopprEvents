package com.varun.topprevents.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Creator: vbarad
 * Date: 2016-09-24
 * Project: TopprEvents
 */

public class Website {
  @Expose
  @SerializedName("id")
  private String id;
  @Expose
  @SerializedName("name")
  private String name;
  @Expose
  @SerializedName("image")
  private String image;
  @Expose
  @SerializedName("category")
  private String category;
  @Expose
  @SerializedName("description")
  private String description;
  @Expose
  @SerializedName("experience")
  private String experience;

  public static Website getInstance(String jsonWebsite) {
    Gson gson =
        new GsonBuilder()
            .create();

    return gson.fromJson(jsonWebsite, Website.class);
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getExperience() {
    return experience;
  }

  public void setExperience(String experience) {
    this.experience = experience;
  }

  @Override
  public String toString() {
    Gson gson =
        new GsonBuilder()
            .create();
    return gson.toJson(this);
  }
}
