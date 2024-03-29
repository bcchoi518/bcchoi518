function countUniqueValues(arr) {
  if (arr.length === 0) {
    return 0;
  }

  let index = 0;

  for (let i = 1; i < arr.length; i++) {
    if (arr[index] !== arr[i]) {
      arr[++index] = arr[i];
    }
  }
  return index + 1;
}

// 배열이 오름차순으로 정렬되어 있어야 함
console.log(countUniqueValues([1, 1, 1, 1, 1, 2])); // 2
console.log(countUniqueValues([1, 2, 3, 4, 4, 4, 7, 7, 12, 12, 13])); // 7
console.log(countUniqueValues([])); // 0
console.log(countUniqueValues([-2, -1, -1, 0, 1])); // 4
