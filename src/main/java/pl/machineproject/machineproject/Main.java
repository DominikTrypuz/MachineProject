package pl.machineproject.machineproject;

import pl.machineproject.machineproject.machine1.Machine1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Machine1 machine1 = new Machine1();

        int valueOne;
        int valueTwo;
        int valurThree;

        System.out.println("Write value one");
        valueOne = scanner.nextInt();

        System.out.println("Write value two");
        valueTwo = scanner.nextInt();

        System.out.println("Write value three");
        valurThree = scanner.nextInt();

        machine1.analyzeMachineByParams(valueOne, valueTwo, valurThree);

        System.out.println(machine1);
    }
}
