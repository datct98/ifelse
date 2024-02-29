package worker.service;

import worker.entities.History;
import worker.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    // Tạp mới công nhân
    public void create(Scanner scanner, ArrayList<Worker> workers){
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập lương: ");
        double salary = Double.parseDouble(scanner.nextLine());
        workers.add(new Worker(name, salary)) ;
    }

    public Worker findById(String id, ArrayList<Worker> workers){
        for (Worker worker: workers){
            if(worker.getId().equalsIgnoreCase(id)){
               return worker;
            }
        }
        return null;
    }

    public void modifySalary(Scanner scanner, ArrayList<Worker> workers, boolean check, ArrayList<History> histories){
        HistoryService historyService = new HistoryService();
        System.out.println("Mời b nhập id công nhân: ");
        String id = scanner.nextLine();
        Worker worker = findById(id, workers);
        if(worker == null){
            System.out.println("Không tìm thấy worker có id: "+id);
        } else {
            System.out.println("Mời b nhập số tiền: ");
            double newSal = Double.parseDouble(scanner.nextLine());
            if(check){
                worker.setSalary( worker.getSalary() + newSal);
                historyService.insertHistory(histories, "UP", worker);
            }else {
                worker.setSalary( worker.getSalary() - newSal);
                historyService.insertHistory(histories, "DOWN", worker);
            }


        }
    }

}
