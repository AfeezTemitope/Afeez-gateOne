const prompt = require("prompt-sync")();
int score = 0;
int total = 0;
int count = 0;
console.log("Enter 10 score");
for(int index = 0; index < 10; index++){
console.log("Enter score" + " " + (index + 1) + " : ");
score = parseInt(prompt())
}
for (int evenIndex = score; evenIndex <= 10; evenIndex +=2){

total += score;
	
}
console.log("Sum of all even index score is " + total);

