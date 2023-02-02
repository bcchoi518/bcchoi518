function maxSubarraySum(arr, num) {
  if (arr.length < num) {
    return null;
  }

  let maxSum = 0;
  for (let i = 0; i < num; i++) {
    maxSum += arr[i];
  }

  let tmpSum = maxSum;
  for (let i = num; i < arr.length; i++) {
    tmpSum = tmpSum - arr[i - num] + arr[i];
    maxSum = Math.max(tmpSum, maxSum);
  }

  return maxSum;
}

console.log(maxSubarraySum([100, 200, 300, 400], 2)); // 700
console.log(maxSubarraySum([1, 4, 2, 10, 23, 3, 1, 0, 20], 4)); // 39
console.log(maxSubarraySum([-3, 4, 0, -2, 6, -1], 2)); // 5
console.log(maxSubarraySum([3, -2, 7, -4, 1, -1, 4, -2, 1], 2)); // 5
console.log(maxSubarraySum([2, 3], 3)); // null
