public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field

    public ToDoItem(String desc){
        description = desc;
        isDone = false;
    }

    public String getDesc(){
        return description;
    }
    public boolean getIsDone(){
        return isDone;
    }

    public void setDesc(String desc){
        description = desc;
    }

    public void setIsDone(boolean isDone){
        this.isDone = isDone;
    }
}