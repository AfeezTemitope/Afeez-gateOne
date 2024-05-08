function evenIndex(numbers) {
    var result = new Array(Math.floor(numbers.length / 2));
    for (var index = 0; index < numbers.length; index += 2) {
        result[index / 2] = numbers[index];
    }
    return result;
}

module.exports = evenIndex;