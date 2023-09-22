    package ProgramingBasicsExam;

    import java.util.Scanner;

    public class HairSalon {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //•	цел за деня – цяло число в интервала [1 … 5000]
            int dailyTarget = Integer.parseInt(scanner.nextLine());
            //След това се четат поредица от редове до получаване на команда "closed"
            String input = scanner.nextLine();
            // или докато Деси не постигне целта за деня – услугата, която иска клиентът – текст с възможности "haircut" и "color".
            //При команда "haircut" ще се очаква да се въведе видът на подстригването – "mens", "ladies" или "kids".
            //При команда "color" ще се очаква видът на боядисването – "touch up" или "full color".
            int price = 0;
            int totalPrice = 0;

            while (!input.equals("closed")) {
                switch (input) {
                    case "haircut":
                        input = scanner.nextLine();
                        if (input.equals("mens")) {
                            price = 15;
                            totalPrice += price;
                        } else if (input.equals("ladies")) {
                            price = 20;
                            totalPrice += price;

                        } else if (input.equals("kids")) {
                            price = 10;
                            totalPrice += price;
                        }
                        if (totalPrice >= dailyTarget) {
                            System.out.println("You have reached your target for the day!");
                            System.out.printf("Earned money: %dlv.", totalPrice);
                            return;
                        }
                        input = scanner.nextLine();
                        break;
                    case "color":
                        input = scanner.nextLine();
                        if (input.equals("touch up")) {
                            price = 20;
                            totalPrice += price;
                        } else if (input.equals("full color")) {
                            price = 30;
                            totalPrice += price;
                        }
                        if (totalPrice >= dailyTarget) {
                            System.out.println("You have reached your target for the day!");
                            System.out.printf("Earned money: %dlv.", totalPrice);
                            return;
                        }
                        input = scanner.nextLine();
                        break;
                    default:
                        break;

                }

            }

            System.out.printf("Target not reached! You need %dlv. more.%n", dailyTarget - totalPrice);

            System.out.printf("Earned money: %dlv.", totalPrice);

        }
    }
