function main(input) {
  let [x1, y1, x2, y2] = input
    .trim()
    .split(" ")
    .map((n) => parseInt(n));

  let x = x2 - x1;
  let y = y2 - y1;

  let x3 = x2 - y;
  let y3 = y2 + x;
  let x4 = x3 - x;
  let y4 = y3 - y;

  console.log(x3, y3, x4, y4);
}
main(require("fs").readFileSync("/dev/stdin", "utf-8"));
