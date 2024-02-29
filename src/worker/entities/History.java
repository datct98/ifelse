package worker.entities;

import worker.service.WorkerService;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class History {
    private static int auId;
    private int id;
    private Worker worker;
    private String idWorker;
    private String status;
    private LocalDateTime localDateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public History(Worker worker, String status) {
        this.id = ++auId;
        this.worker = worker;
        this.status = status;
        this.localDateTime = LocalDateTime.now();
    }

    public History(String workerId, String status) {
        this.id = ++auId;
        this.idWorker = workerId;
        this.status = status;
        this.localDateTime = LocalDateTime.now();
    }


    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", worker=" + worker +
                ", status='" + status + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }

    public void displayHistories(ArrayList<Worker> workers){
        WorkerService workerService = new WorkerService();
        Worker worker = workerService.findById(idWorker, workers);
        System.out.println("Id: "+id+" - worker: "+worker+" - status: "+status);
    }
}
