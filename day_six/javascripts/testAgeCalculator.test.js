const { ageCalculator } = require('./AgeCalculator');
test('testAgeCalculator', () => {
    expect(ageCalculator('04/01/1998')).toBe(26);
});
