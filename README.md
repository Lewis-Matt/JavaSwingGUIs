# JavaSwingGUIs
Head First Java exercises for creating Graphical User Interfaces using Swing GUI components and java.awt events. Note that the book covers Swing, however, the successor to Swing - JavaFX - is what Oracle/industry has shifted to.

## SimpleGUI1
Single button that listens for a click event, and then changes the text of the button.

## SimpleGUI2
Calls paintComponent() each time the button is clicked, randomly changing the color of the circle.

## MyDrawPanel
Examples (non-runnable) of various paintComponent uses. For Graphics2D, see pg 366 of Ch 12. This class is used in SimpleGUI2 (paintComponent).

## Notes
<hr>
JFC is short for Java Foundation Classes, which encompass a group of features for building graphical user interfaces (GUIs) and adding rich graphics functionality and interactivity to Java applications.

### Swing GUI Components
Includes everything from buttons to split panes to tables. Many components are capable of sorting, printing, and drag and drop, to name a few of the supported features.
The Swing API is powerful, flexible — and immense. The Swing API has 18 public packages, but a lot can be done with just:
1. javax.swing
2. javax.swing.event

Swing GUI components are event sources (like a button), and they create an event object when the user interacts (e.g. clicks) with the object.

### Package java.awt.*
Contains all the classes for creating user interfaces and for painting graphics and images. Primarily used for events and event listeners.