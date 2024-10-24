# 🦖 Exercise 4: Dinosaur Management System

When dealing with data about dinosaurs or employees, we may encounter null references. To
avoid a NullPointerException error, use Optional when retrieving a dinosaur by its
name from a map of dinosaurs. If a dinosaur with the provided name doesn’t exist, Optional
should return a message indicating the dinosaur hasn’t been found.

<br />

## 📖 Overview

In this system, you will learn how to effectively manage dinosaur data and handle potential null references. When dealing with data about dinosaurs or employees, it's common to encounter situations where an expected value may be absent. To avoid runtime errors, particularly `NullPointerException`, we utilize `Optional` to safely retrieve dinosaurs by their names.

<br />

## 🔑 Key Features
- **Safe Retrieval**: Use `Optional` for fetching dinosaurs to prevent null reference errors.
- **User-Friendly Messaging**: Return clear messages when a dinosaur cannot be found.
