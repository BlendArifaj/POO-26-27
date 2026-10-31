# Java 04 – Challenges: Encapsulation 🔐

This week's challenges focus on practicing **Encapsulation** in Java.

The exercises are divided into three difficulty levels: Easy, Medium, and Hard.

The main goal is to understand how to protect object attributes, validate data, and control how an object's state can be modified.

---

## 🟢 Challenge 1 – Easy: Book Management

Create a simple Java application to manage a book.

### Requirements

- A book should have a title, author, number of pages, and availability status.
- The user should be able to update the book's title and author.
- The number of pages must be greater than zero.
- A book can only be borrowed if it is available.
- A borrowed book should be possible to return.
- Display all information about the book.

**Bonus Challenge:** Keep track of how many times the book has been borrowed.

---

## 🟡 Challenge 2 – Medium: Product Inventory

Create a Java application to manage a product in a store.

### Requirements

- A product should have a name, price, quantity in stock, and product ID.
- The user should be able to update the product's price.
- The price must be greater than zero.
- Allow adding new quantities to the existing stock.
- Allow selling a specific quantity of the product.
- Selling more items than the available stock should not be allowed.
- Display the product information and the total value of the remaining stock.

**Bonus Challenge:** Implement a discount feature that reduces the product's price by a given percentage.

---

## 🔴 Challenge 3 – Hard: ParkingApp

Create an interactive Java application called **ParkingApp** to manage a small parking area.

The application should allow users to park a car, remove a parked car, calculate parking fees, and view parking statistics.

### Main Menu

```text
======= PARKING APP =======

1. Park a Car
2. Remove a Car
3. Show Parking Status
4. Show Statistics
0. Exit

Choose an option:
```

### Requirements

**1. Park a Car**
- The parking area has only one parking space.
- The user should be able to enter the car's license plate number.
- A new car cannot be parked if the space is already occupied.
- Display a confirmation when a car is successfully parked.

**2. Remove a Car**
- The user should be able to remove the currently parked car.
- The parking fee is **2 EUR per hour**.
- When removing a car, the user must enter the number of hours it was parked.
- The system should calculate and display the total parking fee.
- The parking space becomes available after the car is removed.
- A car cannot be removed if the parking space is empty.

**3. Show Parking Status**

Display:
- Whether the parking space is available or occupied.
- The license plate number if a car is parked.

**4. Show Statistics**

Display:
- Total number of cars served.
- Total money collected from parking fees.

### Bonus Challenge

Generate a random 6-digit parking reference number for every successful parking operation.

---

## 📌 General Requirements

- Apply **Encapsulation** to protect object attributes.
- Prevent uncontrolled modification of object data.
- Validate input values before updating an object's state.
- Use classes, objects, constructors, and methods.
- Use `Scanner` where user interaction is required.
- Organize your classes and methods appropriately.
- Invalid operations must not modify the existing state of an object.
- The implementation and class structure are up to you.