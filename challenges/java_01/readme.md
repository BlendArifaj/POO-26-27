# Week 01 — Classes and Objects

**Course:** Object-Oriented Programming (Java)  
**Topic:** Introduction to Classes, Objects, Attributes, and Methods  
**Difficulty:** Beginner

---

## 📋 General Instructions

1. Create a separate Java directory for each exercise.
2. Use meaningful class, method, and variable names.
3. Follow standard Java naming conventions.
4. Test your implementation with multiple objects.
5. Do not use constructors, inheritance, or advanced Java features.
6. Use predefined values. User input is not required.

---

## 🟢 Challenge 1 — Student Profile

**Difficulty:** Easy

### Description

Create a Java application that represents students using classes and objects.

### Requirements

Create a class named `Student` containing the following attributes:

| Attribute | Type | Description |
|---|---|---|
| `name` | String | Student's full name |
| `age` | int | Student's age |
| `studentId` | String | Unique student identifier |
| `grade` | double | Student's grade |

Implement the following methods:

- `displayInfo()` — Displays all student information.
- `isPassing()` — Returns `true` if the student's grade is at least 50; otherwise, returns `false`.

### Tasks

1. Create the `Student` class.
2. Declare the required attributes and methods.
3. Create at least three different student objects.
4. Assign different values to their attributes.
5. Display the information for each student.
6. Check whether each student has passed.

### Expected Output (Example)

```text
Student: Alice
Age: 20
Student ID: 1001
Grade: 85.5
Status: Passed

Student: Bob
Age: 21
Student ID: 1002
Grade: 42.0
Status: Failed
```

---

## 🟡 Challenge 2 — Book Management

**Difficulty:** Medium

### Description

Create a simple application that manages information about books.

### Requirements

Create a class named `Book` containing:

| Attribute | Type | Description |
|---|---|---|
| `title` | String | Book title |
| `author` | String | Author's name |
| `pages` | int | Number of pages |
| `price` | double | Book price |

Implement the following methods:

- `displayDetails()` — Displays information about the book.
- `isLongBook()` — Returns `true` if the book contains more than 300 pages.
- `applyDiscount(double percentage)` — Reduces the book's price by the specified percentage.

### Tasks

1. Create the `Book` class.
2. Create at least three different book objects.
3. Display their information.
4. Determine which books contain more than 300 pages.
5. Apply a 20% discount to one book.
6. Display the updated price.

### Expected Output (Example)

```text
Title: Clean Code
Author: Robert C. Martin
Pages: 464
Price: 40.0

Long book: true

Applying 20% discount...

Updated Price: 32.0
```

### Additional Requirements

- A discount must not produce a negative price.
- Discount percentages must be between 0 and 100.
- Each book must maintain its own price independently.

---

## 🔴 Challenge 3 — Rectangle Calculator

**Difficulty:** Hard

### Description

Develop a Java application that represents geometric rectangles and performs basic calculations.

### Requirements

Create a class named `Rectangle` containing:

| Attribute | Type | Description |
|---|---|---|
| `width` | double | Rectangle width |
| `height` | double | Rectangle height |

Implement the following methods:

- `calculateArea()` — Returns the rectangle's area.
- `calculatePerimeter()` — Returns the rectangle's perimeter.
- `isSquare()` — Returns `true` if width and height are equal.
- `displayInfo()` — Displays the dimensions, area, perimeter, and whether the shape is a square.

### Tasks

1. Create the `Rectangle` class.
2. Create at least three rectangle objects.
3. Assign different dimensions to each rectangle.
4. Calculate and display their areas and perimeters.
5. Determine whether each rectangle is a square.
6. Identify which rectangle has the largest area.

### Expected Output (Example)

```text
Rectangle 1
Width: 5.0
Height: 10.0
Area: 50.0
Perimeter: 30.0
Is Square: false

Rectangle 2
Width: 8.0
Height: 8.0
Area: 64.0
Perimeter: 32.0
Is Square: true

Largest Rectangle: Rectangle 2
```

### Additional Requirements

- Rectangle dimensions must be positive.
- Calculations must be implemented inside the `Rectangle` class.
- Use object methods rather than performing calculations directly in `main()`.

---

## Bonus Challenge — Object Independence

Using any of the classes from the previous exercises:

1. Create two objects with different attribute values.
2. Display the initial values of both objects.
3. Modify an attribute of the first object.
4. Display both objects again.
5. Verify that modifying one object does not affect the other.

**Question:** Why does changing an attribute in one object not automatically change the same attribute in another object?

---

## ✅ Completion Checklist

Before considering the challenges complete, verify that:

- [ ] All required classes are implemented.
- [ ] Attributes use appropriate data types.
- [ ] All required methods work correctly.
- [ ] Multiple objects can be created from the same class.
- [ ] Each object maintains its own attribute values.
- [ ] All expected calculations are correct.
- [ ] The application compiles and runs without errors.
- [ ] The code follows Java naming conventions.

---

## 📌 Important Notes

These challenges are designed to reinforce the concepts introduced during the first practical session.

**Focus on understanding classes, objects, attributes, and methods rather than introducing additional Java features.**