function Main(input) {
  input = input.split("\n");

  input = input.map((n) => n.split(" "));

  const a = input[1].map((n) => parseInt(n));
  const b = input[2].map((n) => parseInt(n));

  let result = Math.min.apply(null, a) + Math.min.apply(null, b);
  for (i = 0; i < input[0][2]; i++) {
    const temp =
      a[input[3 + i][0] - 1] + b[input[3 + i][1] - 1] - input[3 + i][2];
    if (result > temp) {
      result = temp;
    }
  }

  console.log(result);
}

Main(require("fs").readFileSync("/dev/stdin", "utf-8"));
