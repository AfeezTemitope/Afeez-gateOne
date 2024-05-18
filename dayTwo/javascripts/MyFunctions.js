function evenIndex(numbers) {
    const evenElements = [];

    for (let index = 0; index < numbers.length; index += 2) {
        evenElements.push(numbers[index]); 
}

    return evenElements; 
}

module.exports = evenIndex;


function oddIndex(numbers) {
    const oddElements = [];

    for (let index = 1; index < numbers.length; index += 2) {
        oddElements.push(numbers[index]); 
}

    return oddElements; 
}

module.exports = oddIndex;
