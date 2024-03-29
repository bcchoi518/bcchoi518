function insertionSort(arr) {
  for (let i = 1; i < arr.length; i++) {
    let currentVal = arr[i];
    let idx = 0;
    for (let j = i - 1; j >= 0 && arr[j] > currentVal; j--) {
      arr[j + 1] = arr[j];
      idx = j;
    }
    arr[idx] = currentVal;
  }
  return arr;
}

console.log(insertionSort([100, 3, 23, 6, 12, 44]));
