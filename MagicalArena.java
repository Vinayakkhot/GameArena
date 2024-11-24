package com.MagicalArena;
import java.util.Random;

public class MagicalArena {

    static class Player {
        private String name;
        private int health;
        private int strength;
        private int attack;

        public Player(String name, int health, int strength, int attack) {
            this.name = name;
            this.health = health;
            this.strength = strength;
            this.attack = attack;
        }

        public int rollDice() {
            return new Random().nextInt(6) + 1;
        }

        public void takeDamage(int damage) {
            health = Math.max(0, health - damage);
        }

        public boolean isAlive() {
            return health > 0;
        }

        public int getHealth() {
            return health;
        }

        public int getStrength() {
            return strength;
        }

        public int getAttack() {
            return attack;
        }

        public String getName() {
            return name;
        }
    }

    static class Match {
        private Player playerA;
        private Player playerB;

        public Match(Player playerA, Player playerB) {
            this.playerA = playerA;
            this.playerB = playerB;
        }

        public void start() {
            System.out.println("Starting the match between " + playerA.getName() + " and " + playerB.getName());
            System.out.println("Player Stats:");
            System.out.printf("%s - Health: %d, Strength: %d, Attack: %d%n", playerA.getName(), playerA.getHealth(), playerA.getStrength(), playerA.getAttack());
            System.out.printf("%s - Health: %d, Strength: %d, Attack: %d%n", playerB.getName(), playerB.getHealth(), playerB.getStrength(), playerB.getAttack());
            System.out.println("Let the match begin!");

            while (playerA.isAlive() && playerB.isAlive()) {
                executeTurn();
            }

            if (!playerA.isAlive() && !playerB.isAlive()) {
                System.out.println("It's a draw! Both players have fallen.");
            } else {
                Player winner = playerA.isAlive() ? playerA : playerB;
                System.out.println(winner.getName() + " wins the match!");
            }
        }

        private void executeTurn() {
            boolean turn = new Random().nextBoolean();
            Player attacker = turn ? playerA : playerB;
            Player defender = attacker == playerA ? playerB : playerA;

            int attackRoll = attacker.rollDice();
            int defenseRoll = defender.rollDice();

            int attackDamage = attacker.getAttack() * attackRoll;
            int defenseStrength = defender.getStrength() * defenseRoll;
            int damage = Math.max(1, attackDamage - defenseStrength);

            defender.takeDamage(damage);

            System.out.printf("%s attacks (%d * %d = %d), %s defends (%d * %d = %d), %s takes %d damage, health = %d%n",
                    attacker.getName(), attacker.getAttack(), attackRoll, attackDamage,
                    defender.getName(), defender.getStrength(), defenseRoll, defenseStrength,
                    defender.getName(), damage, defender.getHealth());
        }
    }

    public static void main(String[] args) {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);

        Match match = new Match(playerA, playerB);
        match.start();
    }
}
