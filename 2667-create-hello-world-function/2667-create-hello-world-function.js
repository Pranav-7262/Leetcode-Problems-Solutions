/**
 * @return {Function}
 */
var createHelloWorld = function() {
    const greet = "Hello World";
    return function() {
        return greet;
    }
};


/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */