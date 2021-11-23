public class RepeatedDetailedTask extends DetailedTask{
    int nExecutions;


    public RepeatedDetailedTask(String title, int priority, String[] subTasks, int Executions){
        super(title, priority, subTasks);
        this.nExecutions = Executions;
    }

    @Override
    public String getDescription(){
        return String.format("%s + x%d",super.getDescription(),this.nExecutions);
    }

    @Override
    public void execute(){
        for (int i = 0; i< this.nExecutions; i++) {
            super.execute();
        }
    }
}
