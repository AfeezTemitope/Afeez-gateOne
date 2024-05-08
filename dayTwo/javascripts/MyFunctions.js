function evenIndex(numbers) {
    const evenElements = [];

    for (let index = 0; index < numbers.length; index += 2) {
        evenElements.push(numbers[index]); 
}

    return evenElements; 
}

module.exports = evenIndex;
