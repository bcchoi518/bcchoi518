function sumZero(arr) {
  let left = 0;
  let right = arr.length - 1;
  while (left < right) {
    let sum = arr[left] + arr[right];
    if (sum === 0) {
      return [arr[left], arr[right]];
    } else if (sum > 0) {
      right--;
    } else {
      left++;
    }
  }
}

// 배열이 오름차순으로 정렬되어 있어야 함
console.log(sumZero([-3, -2, -1, 0, 1, 2, 3]));
console.log(sumZero([-3, -2, -1, 0, 5, 10]));
