function main(input) {
  let S = input.split("");
  S = S.map((n) => parseInt(n));

  const targetNum = 753;

  let num = 0;

  let diff = 99999999;
  for (i = 0; i < S.length - 2; i++) {
    num = S[i] * 100 + S[i + 1] * 10 + S[i + 2];
    let tempDiff = Math.abs(targetNum - num);
    if (diff > tempDiff) {
      diff = tempDiff;
    }
  }
  console.log(diff);
}
main(require("fs").readFileSync("/dev/stdin", "utf8"));
