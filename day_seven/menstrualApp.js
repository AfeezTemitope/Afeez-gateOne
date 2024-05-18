const prompt = require("prompt-sync")();

console.log('====================\nWELCOME TO BAD AFEEZ\n   CLINIC\n==================== ');
function calculatesafePeriod(){



}


let name = prompt("What's your name, baby girl?");
console.log(`Hello sweet ${name} . Let's assume you have been tracking your cycle for the past 6 months. Now let's get your cycle length.`);

let lastMenstrualPeriod = prompt("Enter the first day of your last menstrual period (YYYY-MM-DD): ");
let lastMenstrualPeriodDate = new Date(lastMenstrualPeriod);

let cycleLength = parseInt(prompt("Enter your cycle length (in days): "));
let menstruationDuration = parseInt(prompt("Enter your menstruation duration (in days): "));

let safePeriod = calculateSafePeriod(lastMenstrualPeriodDate, cycleLength, menstruationDuration);
console.log(safePeriod);