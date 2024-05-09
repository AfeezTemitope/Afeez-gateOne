const prompt = require("prompt-sync")();
function generateArithmeticProblem() {
    const firstNumber = Math.floor(Math.random() * 10) + 1;
    const secondNumber = Math.floor(Math.random() * 10) + 1;
    const operators = ["*", "+", "-", "/"];
    const selectedOperator = operators[Math.floor(Math.random() * operators.length)];
    const calculation = `${firstNumber} ${selectedOperator} ${secondNumber}`;

    let correctAnswer;
    switch (selectedOperator) {
        case "+":
            correctAnswer = firstNumber + secondNumber;
            break;
        case "-":
            correctAnswer = firstNumber - secondNumber;
            break;
        case "*":
            correctAnswer = firstNumber * secondNumber;
            break;
        case "/":
            correctAnswer = firstNumber / secondNumber;
            break;
    }

    return { selectedOperator, calculation, correctAnswer };
}

const totalAttempts = 10;
let correctAttempts = 0;

console.log("Welcome to the Arithmetic Challenge!\nYou have 10 attempts to solve random arithmetic problems.\n");

for (let attempt = 1; attempt <= totalAttempts; attempt++) {
    const { selectedOperator, calculation, correctAnswer } = generateArithmeticProblem();
    const userAnswer = parseFloat(prompt(`Attempt ${attempt}: What is ${calculation}? `));

    if (userAnswer === correctAnswer) {
        console.log("Correct!\n");
        correctAttempts++;
    } else {
        console.log(`Incorrect. The correct answer was ${correctAnswer}.\n`);
    }
}

console.log("Challenge completed!");
console.log(`Total correct attempts: ${correctAttempts}/${totalAttempts}`);
console.log(`Your final score: ${correctAttempts * 10}%`);
