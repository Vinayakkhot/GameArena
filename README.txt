Magical Arena
Magical Arena is a Java-based battle simulation where two players engage in a dice-rolling combat match. Each player has stats such as health, strength, and attack, which determine the outcome of their battle. The game randomly assigns attack and defense turns, creating a dynamic and unpredictable experience.

Features
Each player has unique attributes: health, strength, and attack.
Dice rolls determine the effectiveness of attack and defense.
Players take turns attacking and defending.
The match ends when one player wins or when there's a draw.

Prerequisites
To run this project, ensure you have:

Java Development Kit (JDK) version 8 or above installed.
Download the latest JDK if not already installed.
A code editor or IDE like:
IntelliJ IDEA
Eclipse
VS Code with Java extensions
Basic knowledge of navigating directories in a command-line interface (CLI).

Steps
Using an IDE
Clone or download the project files:

Ensure that the project structure matches the com/Logics/ package declaration.
Import the project:

Open your preferred Java IDE.
Import the project as a Java project or copy the MagicalArena.java file into a project folder.
Run the file:

Locate the MagicalArena class.
Run the main method directly from the IDE.
Using Command Line
Navigate to the project folder: Ensure the package structure is correct:

markdown
Copy code
com/
    Logics/
        MagicalArena.java
Compile the code: Open a terminal in the root directory (where the com folder is located) and run:

bash
Copy code
javac com/Logics/MagicalArena.java
Run the program: Execute the following command:

bash
Copy code
java com.Logics.MagicalArena
Example Output
When you run the program, you'll see output similar to this:

less
Copy code
Starting the match between Player A and Player B
Player Stats:
Player A - Health: 50, Strength: 5, Attack: 10
Player B - Health: 100, Strength: 10, Attack: 5
Let the match begin!
Player A attacks (10 * 3 = 30), Player B defends (10 * 2 = 20), Player B takes 10 damage, health = 90
Player B attacks (5 * 5 = 25), Player A defends (5 * 4 = 20), Player A takes 5 damage, health = 45
...
Player A wins the match!
Customization
Modify the players' attributes in the main method:

java
Copy code
Player playerA = new Player("Custom Player A", 60, 7, 12);
Player playerB = new Player("Custom Player B", 80, 8, 10);
Adjust the dice roll logic or implement new rules in the Match class.

