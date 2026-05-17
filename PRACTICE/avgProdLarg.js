const prompt = require("prompt-sync")();

    numOne = Number(prompt("Enter first number"));
    numTwo = Number(prompt("Enter second number"));
    numThree = Number(prompt("Enter third number"))

    squareOne = numOne * numOne;
    squareTwo = numTwo * numTwo;
    squareThree = numThree * numThree;

    average = (numOne + numTwo + numThree)/3;
    product = (numTwo * numTwo * numTwo);
    
    largest = numOne;
    if(numTwo > numOne && numTwo > numThree){
    largest = numTwo;
    }
    else if(numThree > numOne && numThree > numOne){
    largest = numThree;
    }
    else{
    console.log("Error")
    }

    console.log("average is: " + average);
    console.log("product is: " + product);
    console.log("largest is: "+ largest);
