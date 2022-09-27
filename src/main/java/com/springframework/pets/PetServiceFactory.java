package com.springframework.pets;

/**
 * @author Yuriy Tsarkov (yurait6@gmail.com) on 27.09.2022
 */
public class PetServiceFactory {

  public PetService getPetService(String petType) {
    switch (petType) {
    case "dog":
      return new DogPetService();
    case "cat":
      return new CatPetService();
    default:
      return new DogPetService();
    }
  }
}
