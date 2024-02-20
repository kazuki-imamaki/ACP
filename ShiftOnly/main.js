function main(input) {
  input = input.split("\n");

  let N = parseInt(input[0]);

  let A = input[1]
    .trim()
    .split(" ")
    .map((n) => parseInt(n));

  let ans = 0;

  while (isEven(A, N)) {
    for (i = 0; i < N; i++) {
      A[i] = A[i] / 2;
    }
    ans++;
  }

  console.log(ans);
}

const isEven = (array, n) => {
  for (i = 0; i < n; i++) {
    if (array[i] % 2 !== 0) {
      return false;
    }
  }
  return true;
};

main(require("fs").readFileSync("/dev/stdin", "utf8"));
