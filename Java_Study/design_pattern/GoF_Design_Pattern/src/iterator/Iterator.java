package iterator;

public interface Iterator {
  boolean next(); // Aggregator의 다음 구성 데이터를 얻을 수 있다면: true, 없다면: false

  Object current(); // 구성 데이터를 하나를 얻어 반환, 구성 데이터의 타입은 정해지지 않아야 하므로 Object로 반환
}// Iterator
