package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "\n" +
                "and will share his treasure with you. The other dragon\n" +
                "\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "\n" +
                "Which cave will you go into? (1 or 2)");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                System.out.println("You approach the cave...\n" +
                        "\n" +
                        "It is dark and spooky...\n" +
                        "\n" +
                        "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                        "\n" +
                        "Gobbles you down in one bite!");
                break;
            case 2:
                System.out.println("You approach the cave...\n" +
                        "\n" +
                        "It is dark and spooky...\n" +
                        "\n" +
                        "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                        "\n" +
                        "Greets you warmly and gives you some treasure!");
                break;
            default:
                System.out.println("Unable to choose between two clearly defined choices, you stand there until the end of time.");
                break;
        }
    }
}
