package worker.service;

import worker.entities.History;
import worker.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class HistoryService {
    public void insertHistory(ArrayList<History> histories, String status, Worker worker){
        History history = new History(worker, status);
        history.setStatus(status);
        histories.add(history);
    }
}
