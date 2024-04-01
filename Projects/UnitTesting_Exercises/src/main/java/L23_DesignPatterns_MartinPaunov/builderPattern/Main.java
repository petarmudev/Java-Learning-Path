package L23_DesignPatterns_MartinPaunov.builderPattern;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        LunchOrder lunchOrder = LunchOrder.Builder.get()
                .withBread("White")
                .withMeat("Pork")
                .withSalad("Cesar")
                .withDrink("Ouzo")
                .build();
        System.out.println(lunchOrder.toString());
        /*
        public Builder withBread(String bread) {
            this.order.setBread(bread);
            return this;
        }
         */

        //Same logic:

        StringBuilder builder = new StringBuilder();
        String string = builder.append(13)
                .append(" is")
                .append(" a magic")
                .append(" number")
                .toString();
        System.out.println(string);
        /*  Same logic for the Java StringBuilder's method:

        public StringBuilder append(String str) {
            super.append(str);
            return this;
        }
         */
    }
}
