//public class Todo extends Task {
//    protected boolean isDone;
//    Todo(String description) {
//        super(description);
//        this.isDone=false; //not sure if this line needs to be here
//    }
//    public boolean isDone() {
//        return this.isDone;
//    }
//    public void setDone(boolean isDone) {
//        this.isDone = isDone;
//    }
//
//}

public class Todo extends Task {
    protected boolean isDone;

    public Todo(String description) {
        super(description);
        isDone = false;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public boolean isDone() {
        return isDone;
    }

    @Override

    /**
     * this could just be solved with super.toString()
     */
    public String toString() {
        String status = this.isDone?"Yes":"No";
        return "description: " + this.description + "\nis done? " + status ;
    }
}

