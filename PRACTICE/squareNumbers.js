const prompt = require("prompt-sync")();


let numOne = Number(prompt("Enter first number "));
let numTwo = Number(prompt("ENter second number "));

let squareOne = numOne * numOne;
let squareTwo = numTwo * numTwo;

let sumSquare = squareOne + squareTwo;
let diffSquare = squareOne + squareTwo;

console.log("square of both numbers is " + squareOne + " and " + squareTwo);
console.log("Sum and differnence of squares is " + sumSquare + " and " + squareTwo)
