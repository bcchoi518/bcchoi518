function isSubsequence(str1, str2) {
  if (str1.length > str2.length) {
    return false;
  }

  let index = 0;
  for (let ch of str2) {
    if (str1[index] == ch) {
      index++;
    }

    if (index == str1.length) {
      return true;
    }
  }

  return false;
}

console.log(isSubsequence("hello", "hello world")); // true
console.log(isSubsequence("sing", "sting")); // true
console.log(isSubsequence("abc", "abracadabra")); // true
console.log(isSubsequence("abc", "acb")); // false (order matters)
