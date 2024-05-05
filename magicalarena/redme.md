# Magical Arena

## Introduction

This is a program that simulates a magical arena where players battle using dice rolls and various attributes such as health, strength, and attack points. Players take turns attacking and defending until one player's health reaches zero, at which point the other player is declared the winner.

## Rules of the Game

-   Each player is defined by their health, strength, and attack attributes, all of which are positive integers.
-   The player dies if their health attribute reaches 0.
-   Players attack in turns, with the attacking player rolling the attacking dice and the defending player rolling the defending dice.
-   The attack damage is calculated by multiplying the attack value with the outcome of the attacking dice roll.
-   The defending strength is calculated by multiplying the defending player's strength with the outcome of the defending dice roll.
-   Damage taken by the defending player is the difference between the attack damage and the defending strength.
-   The game ends when any player's health reaches 0.
-   The player with lower health attacks first at the start of a match.

## Implementation Details

-   The program is implemented in Java.
-   The `MagicArena` class contains the logic for starting and running the game.
-   The `startGame` method takes two `Player` objects as parameters and simulates the battle between them.
-   During each round of the game, players roll dice to determine their attack and defense outcomes, calculate damage, and update their health accordingly.
-   The game continues until one player's health reaches 0, at which point the other player is declared the winner.

## Running the Program

1. Download the zip file containing the program.
2. Extract the contents of the zip file to your local machine.
3. This program uses Java 22 so configure jdk accordingly.

## Naming convention

-   All variable name and method name should be in Camel Case.
-   All class name is should be in Pascal case.
