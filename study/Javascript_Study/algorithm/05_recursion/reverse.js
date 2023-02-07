function reverse(str) {
  if (str.length === 1) {
    return str;
  }

  return str[str.length - 1].concat(reverse(str.substring(0, str.length - 1)));
}

console.log(reverse("awesome")); // 'emosewa'
console.log(reverse("rithmschool")); // 'loohcsmhtir'
