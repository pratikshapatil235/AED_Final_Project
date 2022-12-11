package model.taskbuffer;

import java.util.ArrayList;

public class TaskBuffer {

    private ArrayList<TaskRequest> workRequests;

    public TaskBuffer() {
        workRequests = new ArrayList();
    }

    public ArrayList<TaskRequest> getWorkRequests() {
        return workRequests;
    }
}
