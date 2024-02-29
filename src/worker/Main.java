package worker;

import worker.entities.History;
import worker.entities.Worker;
import worker.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Worker> workers = new ArrayList<>();
        ArrayList<History> histories = new ArrayList<>();
        menu.displayMenuHome(scanner, workers, histories);
    }
}
