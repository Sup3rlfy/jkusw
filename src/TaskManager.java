public class TaskManager {
    static final int MAX_CAPACITY = 10;
    Task[] tasks;
    int pos;

    public TaskManager(){
        this.tasks = new Task[MAX_CAPACITY];
        this.pos = 0;
    }


    boolean addTask(Task task){
        if ( pos < MAX_CAPACITY) {
            tasks[pos] = task;
            pos++;
            return true;
        }
        return false;
    }

    boolean executeTask(int taskNr){
        if (taskNr >= 0 && taskNr <= pos-1){
            this.tasks[taskNr].execute();
            return true;
        }
        //Out.println(String.format("Could not execute task. Invalid task number %d", taskNr));
        return false;
    }

    void print(){
        Out.println(String.format("Tasks in Queue: %d", pos));
        if (pos > 0) {
            for (Task t : this.tasks) {
                Out.println(t.getDescription());
            }
        }
    }
}
