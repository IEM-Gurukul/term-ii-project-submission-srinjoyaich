[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

Smart Parking Management System

## Problem Statement (max 150 words)
In busy urban areas, finding a parking space is often difficult and time-consuming. Drivers 
frequently spend unnecessary time searching for available parking spots, which leads to 
traffic congestion and inefficient parking management. The Smart Parking Management 
System aims to automate the process of allocating parking slots for different types of 
vehicles. The system keeps track of available parking spaces, records vehicle entry and exit 
times, and calculates parking fees automatically. This project demonstrates how 
object-oriented programming can be used to design a structured and scalable parking 
management solution.

## Target User
1.Parking lot administrators 
2.Vehicle owners / drivers 
3.Security or gate operators managing entry and exit

## Core Features
1.Vehicle entry registration 
2.Automatic parking slot allocation 
3.Different vehicle types (Car, Bike, Truck) 
4.Track entry and exit time 
5.Parking fee calculation 
6.Display available parking slots 
7.Generate parking ticket/receipt

## OOP Concepts Used
1.Encapsulation – Protect vehicle and parking data using private variables and getter/setter 
methods. 
2.Inheritance – Car, Bike, and Truck inherit from the Vehicle class. 
3.Polymorphism – Different fee calculations for different vehicle types. 
4.Abstraction – Abstract class or interface for vehicle operations. 
5.Classes & Objects – Represent real-world entities like vehicles, parking slots, and tickets. 

## Proposed Architecture Description
The Smart Parking Management System follows a modular object-oriented architecture 
where different classes represent real-world entities of a parking lot. The system is centered 
around the ParkingLot class, which manages parking slots, vehicle entry, and exit operations. 
A base Vehicle class represents general vehicle information, while subclasses such as Car, 
Bike, and Truck inherit from it to handle specific vehicle types. Each parked vehicle is 
associated with a ParkingSlot and a Ticket that records entry time, exit time, and parking fee. 
A main controller class provides a menu-driven interface to coordinate interactions between 
all components. 

## How to Run
1.Open the project in VS Code or any Java IDE and navigate to the src folder.
2.Compile the program using javac *.java.
3.Run the application using java Main and follow the menu options.

## Git Discipline Notes
Minimum 10 meaningful commits required.
