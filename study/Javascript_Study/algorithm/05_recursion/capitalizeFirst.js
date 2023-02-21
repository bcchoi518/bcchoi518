function capitalizeFirst(array) {
  let first = array[0].charAt(0).toUpperCase();
  let remain = array[0].slice(1);
  array[0] = first + remain;

  if (array.length === 1) {
    return array;
  }

  let res = capitalizeFirst(array.slice(1));
  res.unshift(array[0]);

  return res;
}

console.log(capitalizeFirst(["car", "taco", "banana"])); // ['Car','Taco','Banana']
