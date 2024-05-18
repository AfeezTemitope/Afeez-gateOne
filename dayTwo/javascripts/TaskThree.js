const prompt = require("prompt-sync")();

let score = []
console.log("Enter 10 Score")

for(let index = 0; index < 10; index++){
scores = prompt("Enter Score " + " " + (index + 1) + " : ")
score.push(scores)

}
console.log(score)