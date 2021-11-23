public class Task {
    public String title;
    public int priority;

    public Task(String title, int priority){
        this.title = title;
        this.priority = priority;
    }

    public Task(String title){
        this(title, 1);
    }

    public String getDescription(){
        return String.format("%s (%d)", this.title, this.priority);
    }

    public void execute(){
        Out.println(String.format("Executing Task: %s",this.getDescription()));
    }
}
