# 🏆 Week 02 — Static Members, Math & User Input

**Course:** Object-Oriented Programming (Java)  
**Topic:** Static Variables, Static Methods, Math, and Scanner  
**Difficulty:** Beginner to Intermediate

---

## 🎯 Learning Objectives

By completing these challenges, students should be able to:

- Understand the difference between static and instance members.
- Define and call static methods.
- Use static variables shared across objects.
- Use Java's built-in `Math` methods.
- Generate random numbers using `Math.random()`.
- Understand type casting and random number ranges.
- Read and process user input using `Scanner`.
- Combine classes, methods, and user input to build interactive applications.

## 📋 General Instructions

1. Create a separate Java project or directory for each challenge.
2. Use meaningful class, method, and variable names.
3. Follow standard Java naming conventions.
4. Use `Scanner` whenever user input is required.
5. Implement the requested static methods instead of writing all logic inside `main()`.
6. Test your application with different inputs, including edge cases.
7. Do not use inheritance, interfaces, collections, or advanced Java concepts.
8. Do not use `java.util.Random` for exercises that require `Math.random()`.

---

## 🟢 Challenge 1 — Interactive Math Calculator

**Difficulty:** Easy

### Description

Develop an interactive Java application that performs mathematical operations based on user input.

The application must use **static methods** and the Java `Math` class.

### Requirements

Create a class named `MathCalculator` containing the following static methods:

| Method | Description |
|---|---|
| `add(double a, double b)` | Returns the sum |
| `subtract(double a, double b)` | Returns the difference |
| `multiply(double a, double b)` | Returns the product |
| `divide(double a, double b)` | Returns the quotient |
| `power(double a, double b)` | Uses `Math.pow()` |
| `maximum(double a, double b)` | Uses `Math.max()` |
| `minimum(double a, double b)` | Uses `Math.min()` |

### Tasks

1. Create the `MathCalculator` class.
2. Implement all required static methods.
3. Use `Scanner` to read two numbers from the user.
4. Display a menu containing the available operations.
5. Ask the user to select an operation.
6. Call the corresponding static method.
7. Display the result.
8. Allow the user to perform multiple calculations until they choose to exit.

### Expected Output (Example)

```text
===== MATH CALCULATOR =====

Enter first number: 10
Enter second number: 3

Choose an operation:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Power
6. Maximum
7. Minimum
8. Exit

Your choice: 5

Result: 1000.0
```

### Additional Requirements

- Handle division by zero.
- Handle invalid menu options.
- Call static methods using the class name, for example `MathCalculator.add(...)`.
- Do not create an instance of `MathCalculator`.

---

## 🟡 Challenge 2 — Guess the Secret Number

**Difficulty:** Medium

### Description

Create a number-guessing game where the computer generates a secret number and the player must guess it.

The application must use `Math.random()`, `Scanner`, and static methods.

### Requirements

Create a class named `GuessingGame`.

Implement the following static methods:

| Method | Description |
|---|---|
| `generateSecretNumber()` | Generates a random integer between 1 and 100, inclusive |
| `checkGuess(int guess, int secret)` | Returns 0 if correct, -1 if too low, and 1 if too high |
| `displayResult(int attempts, boolean won)` | Displays the final game result |

### Game Rules

1. The computer randomly generates a number between **1 and 100**.
2. The player has a maximum of **7 attempts**.
3. After every incorrect guess, display a hint:
    - "Too high!"
    - "Too low!"
4. If the player guesses correctly, display a success message.
5. If the player uses all seven attempts, reveal the secret number.
6. Ask the player whether they want to play again.

### Expected Output (Example)

```text
===== GUESS THE NUMBER =====

I generated a number between 1 and 100.
You have 7 attempts!

Attempt 1: 50
Too high!

Attempt 2: 25
Too low!

Attempt 3: 35
Too low!

Attempt 4: 42
Correct!

Congratulations!
You guessed the number in 4 attempts.

Play again? (yes/no): no

Thanks for playing!
```

*The actual secret number and number of attempts will vary.*

### Additional Requirements

- Generate the secret number only once per game.
- Reject guesses outside the range of 1–100 without consuming an attempt.
- Keep track of the number of attempts.
- Use static methods for number generation and guess checking.
- Generate a new secret number whenever a new game starts.

### Questions to Think About

1. What range of values does `Math.random()` produce?
2. Why do we multiply the result by 100?
3. Why is the order of casting and multiplication important?
4. Can `Math.random()` return exactly 1.0?
5. How can we ensure that 100 is a possible secret number?

---

## 🔴 Challenge 3 — Dice Battle Simulator

**Difficulty:** Hard

### Description

Build a dice battle game between a player and the computer.

Each participant rolls a six-sided die. The participant with the higher number wins the round.

The application must use **static variables, static methods, `Math.random()`, and `Scanner`**.

### Requirements

Create a class named `DiceGame`.

**Static variables:**

| Variable | Description |
|---|---|
| `totalRounds` | Total number of rounds played |
| `playerWins` | Number of rounds won by the player |
| `computerWins` | Number of rounds won by the computer |
| `draws` | Number of tied rounds |

**Static methods:**

| Method | Description |
|---|---|
| `rollDice()` | Generates a random integer between 1 and 6 |
| `playRound()` | Executes one round of the game |
| `displayStatistics()` | Displays game statistics |
| `resetStatistics()` | Resets all counters to zero |

### Tasks

1. Create the `DiceGame` class.
2. Declare the required static variables.
3. Implement the `rollDice()` method using `Math.random()`.
4. Use `Scanner` to ask how many rounds the player wants to play.
5. For each round:
    - Generate a dice value for the player.
    - Generate a dice value for the computer.
    - Compare both values.
    - Determine the winner.
    - Update the appropriate static counters.
6. Display the final statistics after all rounds.
7. Allow the user to start another game or exit.

### Expected Output (Example)

```text
===== DICE BATTLE =====

How many rounds? 3

--- Round 1 ---
Player rolled: 6
Computer rolled: 3
Player wins!

--- Round 2 ---
Player rolled: 2
Computer rolled: 5
Computer wins!

--- Round 3 ---
Player rolled: 4
Computer rolled: 4
It's a draw!

===== FINAL STATISTICS =====

Total Rounds: 3
Player Wins: 1
Computer Wins: 1
Draws: 1

Overall Result: Draw!
```

*Dice rolls are random, so results will differ between executions.*

### Additional Requirements

- Dice values must always be between 1 and 6.
- Use `Math.random()` rather than `java.util.Random`.
- Game statistics must be stored in static variables.
- Call `rollDice()` separately for the player and computer.
- Reject requests to play zero or negative rounds.
- Ensure that player wins + computer wins + draws equals the total rounds played.
- Reset statistics when starting a new game.

### Questions to Think About

1. Why are the game statistics stored in static variables?
2. Why is `rollDice()` a static method?
3. What happens if we call `rollDice()` multiple times?
4. How can we ensure every dice value is between 1 and 6?
5. What is the difference between static variables and local variables?

---

## ⭐ Bonus Challenge — The Math.random() Trap

**Difficulty:** Tricky

### Description

The Java `Math.random()` method returns a `double` greater than or equal to 0.0 and strictly less than 1.0.

Your task is to analyze several expressions and identify their possible outputs.

### Part A — Predict the Output

For each expression, determine the minimum and maximum possible integer values.

**Expression 1:**

```java
int number = (int) (Math.random() * 10);
```

**Expression 2:**

```java
int number = (int) (Math.random() * 10) + 1;
```

**Expression 3:**

```java
int number = (int) Math.random() * 10;
```

**Expression 4:**

```java
int number = 5 + (int) (Math.random() * 6);
```

Answer these questions:

1. Which expression can generate the number 0?
2. Which expression generates integers from 1 to 10?
3. Which expression always produces the same result?
4. Which expression generates integers from 5 to 10?
5. Why does moving the type cast change the result?

### Part B — Generate Specific Ranges

Write Java expressions using only `Math.random()` to generate random integers in the following ranges.

| Task | Minimum | Maximum |
|---|---:|---:|
| 1 | 1 | 6 |
| 2 | 0 | 100 |
| 3 | 10 | 20 |
| 4 | -5 | 5 |
| 5 | 100 | 999 |

**Important:** Both the minimum and maximum values must be possible outputs.

### Part C — Find the Bug

A student wants to generate a random integer between 1 and 6 and writes:

```java
int dice = (int) Math.random() * 6 + 1;
```

However, the result is always the same.

**Your tasks:**

1. Explain why the result never changes.
2. Correct the expression.
3. Explain why the corrected version works.
4. Modify the expression to generate integers between 10 and 15.

---

## ✅ Completion Checklist

Before considering the challenges complete, verify that:

- [ ] Static methods are implemented and called correctly.
- [ ] Static variables are used where required.
- [ ] User input is read using `Scanner`.
- [ ] Mathematical calculations produce correct results.
- [ ] Random numbers are generated within the required ranges.
- [ ] Invalid inputs are handled according to the requirements.
- [ ] The applications compile and execute successfully.
- [ ] The code follows Java naming conventions.
- [ ] The bonus challenge questions have been answered.