const main = (input) => {
  const [N, A, B] = input
    .trim()
    .split(" ")
    .map((n) => BigInt(n));

  const surplus = N % (A + B);
  const apend = A < surplus ? A : surplus;

  const res = A * (N / (A + B)) + apend;

  console.log(`${res}`);
};

main(require("fs").readFileSync("/dev/stdin", "utf8"));
