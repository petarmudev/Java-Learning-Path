package Fund_Exams_04.ProgrammingFundamentalsFinalExam;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Task03_HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfHeroes = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> heroesHealth = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> heroesMana = new LinkedHashMap<>();
        //Input of the heroes
        for (int i = 0; i < numberOfHeroes; i++) {
            String[] input = scanner.nextLine().split(" ");
            //"{hero name} {HP} {MP}"
            String heroName = input[0];
            int health = Integer.parseInt(input[1]);
            int mana = Integer.parseInt(input[2]);

            if (heroesHealth.containsKey(heroName)) {
                heroesHealth.put(heroName, health);
                heroesMana.put(heroName, health);
            }
            heroesHealth.putIfAbsent(heroName, health);
            heroesMana.putIfAbsent(heroName, mana);
        }
        //Action with the heroes
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] commandParts = input.split(" - "); //"CastSpell – {hero name} – {MP needed} – {spell name}"
            String command = commandParts[0];
            String heroName = commandParts[1];
            switch (command) {
                //"CastSpell – {hero name} – {MP needed} – {spell name}"
                case "CastSpell":
                    int manaNeeded = Integer.parseInt(commandParts[2]);
                    int currentMana = heroesMana.get(heroName);
                    String spellName = commandParts[3];
                    if (currentMana >= manaNeeded) {
                        heroesMana.put(heroName, (currentMana - manaNeeded));
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n"
                                , heroName, spellName, currentMana - manaNeeded);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;

                // "TakeDamage – {hero name} – {damage} – {attacker}"
                case "TakeDamage":
                    int damage = Integer.parseInt(commandParts[2]);
                    String attacker = commandParts[3];
                    int currentHealth = heroesHealth.get(heroName);
                    if ((currentHealth - damage) > 0) {
                        heroesHealth.put(heroName, currentHealth - damage);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n"
                                , heroName, damage, attacker, heroesHealth.get(heroName));
                    } else {
                        heroesHealth.remove(heroName);
                        heroesMana.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    }
                    break;
                //"Recharge – {hero name} – {amount}"
                case "Recharge":
                    int manaToRecharge = Integer.parseInt(commandParts[2]);
                    currentMana = heroesMana.get(heroName);
                    if ((currentMana + manaToRecharge) <= 200) {
                        heroesMana.put(heroName, currentMana + manaToRecharge);
                        System.out.printf("%s recharged for %d MP!%n", heroName, manaToRecharge);
                    } else {
                        int manaRecharged = 200 - heroesMana.get(heroName);
                        heroesMana.put(heroName, 200);
                        System.out.printf("%s recharged for %d MP!%n", heroName, manaRecharged);
                    }
                    break;
                //"Heal – {hero name} – {amount}"
                case "Heal":
                    int healAmount = Integer.parseInt(commandParts[2]);
                    currentHealth = heroesHealth.get(heroName);
                    if ((currentHealth + healAmount) > 100) {
                        heroesHealth.put(heroName, 100);
                        System.out.printf("%s healed for %d HP!%n", heroName, 100 - currentHealth);
                    } else {
                        heroesHealth.put(heroName, currentHealth + healAmount);
                        System.out.printf("%s healed for %d HP!%n", heroName, healAmount);
                    }
                    break;
                default:
                    break;
            }
        }
        //Print
        //"{hero name}
        //  HP: {current HP}
        //  MP: {current MP}"
        heroesHealth.entrySet().forEach(hero -> {
            System.out.printf("%s%n  HP: %d%n  MP: %d%n", hero.getKey(), hero.getValue(), heroesMana.get(hero.getKey()));
        });
    }
}
