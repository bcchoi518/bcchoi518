package chapter10.service;

import chapter10.model.Price;

public class BasicPriceProcessor implements PriceProcessor {

  @Override
  public Price process(Price price) {
    return price;
  }

}
