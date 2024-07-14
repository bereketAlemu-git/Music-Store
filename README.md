# Music-Store

Name: Bereket Alemu

## Overview
This focuses on creating a GUI for a DVD collection using JavaFX. The objectives include learning how to create windows with various components, using Panes in multiple GUIs, and writing simple event handlers.

## Getting Started
To run the project, follow these steps:

1. **Install JavaFX**: Download JavaFX from [here](https://gluonhq.com/products/javafx/).
2. **Setup IntelliJ**:
    - Add the JavaFX library to your project.
    - Set up the VM options as instructed.

## Running the Project
1. **Open the Project**: Open the project in IntelliJ IDEA.

2. **Run the Application**: Execute the `DVDCollectionApp`, `DVDCollectionApp1`, or `DVDCollectionApp2` classes to see the different stages.

## Code Overview

### DVDCollectionApp
This class represents the GUI for a DVD collection. It includes labels, list views, and buttons laid out manually.

### DVDButtonPane
A subclass of `Pane` containing three buttons sized and spaced as required.

### DVDCollectionApp1
An updated version of `DVDCollectionApp` using `DVDButtonPane` for the button layout.

### DVDCollectionApp2
A GUI similar to `DVDCollectionApp1`, but with one `ListView` and three `TextField` objects. It uses a `DVDCollection` object as its model.

## Features
- **DVDCollectionApp**: Basic GUI layout with labels, list views, and buttons.
- **DVDButtonPane**: Encapsulates button layout for reuse in multiple GUIs.
- **DVDCollectionApp1**: Demonstrates how to use `DVDButtonPane` in a GUI.
- **DVDCollectionApp2**: Integrates a `DVDCollection` model and provides functionalities to add, delete, and view DVDs.

## Event Handling
- **Add Button**: Adds a new DVD to the collection with details from the text fields.
- **Delete Button**: Removes the selected DVD from the collection.
- **ListView Click**: Displays the selected DVD's details in the text fields.


This is from comp 1406 at carleton University
