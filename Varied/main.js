const main = (input) => {
  let S = input.trim().split("");
  let ans = "yes";
  let dic = [];

  for (var chara of S) {
    dic.some((d) => {
      if (chara == d) {
        ans = "no";
        return true;
      }
    });
    if (ans == "no") {
      break;
    }
    dic.push(chara);
  }

  console.log(ans);
};
main(require("fs").readFileSync("/dev/stdin", "utf8"));
