package L06_ExerciseMultidimensionalArrays;

import java.util.Scanner;

public class Task08_TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Sorry, but this is a golden solution of the problem!!!
        //!!! P.M.

        int playerRow = 7;
        int playerCol = 7;
        int playerHealth = 18500;
        double bossHealth = 3000000;

        int plagueCloudDamage = 3500;
        int eruptionDamage = 6000;

        double playerDamage = Double.parseDouble(scanner.nextLine());

        boolean poisoned = false;
        boolean fightFinished = false;
        boolean playerDead = false;
        boolean bossDead = false;
        String lastSpellHit = "";

        while (!fightFinished) {
            bossHealth -= playerDamage;

            if (poisoned) {
                playerHealth -= plagueCloudDamage;
                poisoned = false;
            }

            if (playerHealth <= 0) {
                fightFinished = true;
                playerDead = true;
            }

            if (bossHealth <= 0) {
                fightFinished = true;
                bossDead = true;
            }

            if (fightFinished) {
                break;
            }

            String[] attack = scanner.nextLine().split(" ");
            String spell = attack[0];
            int spellRow = Integer.parseInt(attack[1]);
            int spellCol = Integer.parseInt(attack[2]);
            boolean isHit = false;
            if (spellRow == playerRow && spellCol == playerCol) {
                isHit = true;
            } else if (Math.abs(playerCol - spellCol) <= 1 && Math.abs(playerRow - spellRow) <= 1) {
                if (upIsSafe(playerRow, spellRow)) {
                    playerRow -= 1;
                } else if (rightIsSafe(playerCol, spellCol)) {
                    playerCol += 1;
                } else if (downIsSafe(playerRow, spellRow)) {
                    playerRow += 1;
                } else if (leftIsSafe(playerCol, spellCol)) {
                    playerCol -= 1;
                } else {
                    isHit = true;
                }
            }

            if (isHit) {
                if (spell.equals("Cloud")) {
                    playerHealth -= plagueCloudDamage;
                    poisoned = true;
                    lastSpellHit = "Plague Cloud";
                } else {
                    playerHealth -= eruptionDamage;
                    lastSpellHit = "Eruption";
                }
            }

            if (playerHealth < 0) {
                fightFinished = true;
                playerDead = true;
            }
        }

        if (bossDead) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f%n", bossHealth);
        }

        if (playerDead) {
            System.out.println("Player: Killed by " + lastSpellHit);
        } else {
            System.out.println("Player: " + playerHealth);
        }

        System.out.printf("Final position: %d, %d%n", playerRow, playerCol);
    }

    public static boolean upIsSafe(int playerRow, int spellRow) {
        return playerRow - 1 >= 0 && Math.abs(playerRow - 1 - spellRow) > 1;
    }

    public static boolean rightIsSafe(int playerCol, int spellCol) {
        return playerCol + 1 < 15 && Math.abs(playerCol + 1 - spellCol) > 1;
    }

    public static boolean downIsSafe(int playerRow, int spellRow) {
        return playerRow + 1 < 15 && Math.abs(playerRow + 1 - spellRow) > 1;
    }

    public static boolean leftIsSafe(int playerCol, int spellCol) {
        return playerCol - 1 >= 0 && Math.abs(playerCol - 1 - spellCol) > 1;
    }
}


