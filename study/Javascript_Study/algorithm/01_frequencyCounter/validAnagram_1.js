function validAnagram(str1, str2) {
  if (str1.length != str2.length) {
    return false;
  }

  // 각 문자열의 문자의 갯수 구하기
  let frequencyCounter1 = {};
  let frequencyCounter2 = {};

  for (let ch of str1) {
    frequencyCounter1[ch] = (frequencyCounter1[ch] || 0) + 1;
  }
  for (let ch of str2) {
    frequencyCounter2[ch] = (frequencyCounter2[ch] || 0) + 1;
  }

  // 비교하기
  for (let key in frequencyCounter1) {
    if (frequencyCounter1[key] != frequencyCounter2[key]) {
      return false;
    }
  }
  return true;
}

console.log(validAnagram("", "")); // true
console.log(validAnagram("aaz", "zza")); // false
console.log(validAnagram("anagram", "nagaram")); // true
console.log(validAnagram("rat", "car")); // false
console.log(validAnagram("awesome", "awesom")); // false
console.log(validAnagram("amanaplanacanalpanama", "acanalmanplanpamana")); // false
console.log(validAnagram("qwerty", "qeywrt")); // true
console.log(validAnagram("texttwisttime", "timetwisttext")); // true
