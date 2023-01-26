function validAnagram(str1, str2) {
  if (str1.length != str2.length) {
    return false;
  }

  const frequencyCounter = {};

  // 첫번째 문자열의 문자 갯수 구하기
  for (let i = 0; i < str1.length; i++) {
    let letter = str1[i];
    frequencyCounter[letter]
      ? (frequencyCounter[letter] += 1)
      : (frequencyCounter[letter] = 1);
  }

  // 문자열 갯수를 구한 객체에서 두번째 문자열의 문자의 갯수 만큼 제외하기
  for (let i = 0; i < str2.length; i++) {
    let letter = str2[i];
    if (!frequencyCounter[letter]) {
      return false;
    } else {
      frequencyCounter[letter] -= 1;
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
