function maxSubarraySum(arr, num) {
  if (num > arr.length) {
    return null;
  }

  let maxSum = 0;
  let tmpSum = 0;

  for (let i = 0; i < num; i++) {
    maxSum += arr[i];
  }

  tmpSum = maxSum;
  for (let i = num; i < arr.length; i++) {
    tmpSum = tmpSum - arr[i - num] + arr[i];
    maxSum = Math.max(tmpSum, maxSum);
  }

  return maxSum;
}

console.log(maxSubarraySum([2, 6, 9, 2, 1, 8, 5, 6, 3], 3));
