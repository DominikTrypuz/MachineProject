package pl.machineproject.machineproject;

import pl.machineproject.machineproject.machine.Machine;

import java.util.Scanner;

public class Main {

    public static void main() {

        Scanner scanner = new Scanner(System.in);
        Machine machine1 = new Machine();

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
