const prompt = require("prompt-sync")();

let score = 0;
let total = 0;
console.log("Enter 10 score");
for(let index = 0; index < 10; index++){
score = parseInt(prompt("score " + (index + 1) +" :"));
total += score;
}
	
console.log("Sum of all 10 score is " + total);