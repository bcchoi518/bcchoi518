package com.example.orderFood;

public class Cooking {

  public Cook makeCook(MenuItem menuItem) {
    Cook cook = new Cook(menuItem);
    return cook;
  }

}
