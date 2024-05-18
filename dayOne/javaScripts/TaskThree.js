const prompt = require("prompt-sync")();

let scoreCount = 0
let total = 0
let average = 0
let SCORE = 10
	console.log("Enter 10 score")
	for(let index = 0; index < 10; index++){
	console.log("Enter score" + " " + (index + 1) + " : ")
		scoreCount = parseInt(prompt())
		total += scoreCount;

		average = total / SCORE



	}
console.log("Sum of all 10 score is " + total)
console.log("Averagescore of all 10 score is " + average)