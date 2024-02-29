package worker.view;

import worker.entities.History;
import worker.entities.Worker;
import worker.service.HistoryService;
import worker.service.WorkerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void displayMenuHome(Scanner scanner, ArrayList<Worker> workers, ArrayList<History> histories){
        while (true){
            System.out.println("=======Management Worker========");
            System.out.println("1: Add worker");
            System.out.println("2: Up salary");
            System.out.println("3: Down salary");
            System.out.println("4: Display info");
            System.out.println("Please choose: ");

            WorkerService workerService = new WorkerService();
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    workerService.create(scanner, workers);
                    break;
                case 2:
                    workerService.modifySalary(scanner, workers, true, histories);
                    break;
                case 3:
                    workerService.modifySalary(scanner, workers, false, histories);
                    break;
                case 4:
                    break;
                case 5:
                    //System.out.println(histories);
                   for (History history: histories){
                       history.displayHistories(workers);
                   }

            }
            System.out.println("Do you want to continues?(Y/N)");
            String select = scanner.nextLine();
            if(select.equalsIgnoreCase("N"))
                break;
        }
    }
}
