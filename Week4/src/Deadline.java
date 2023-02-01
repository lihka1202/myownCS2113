//public class Deadline extends Todo{
//    protected String by;
//
//    public String getBy() {
//        return by;
//    }
//
//    public void setBy(String by) {
//        this.by = by;
//    }
//    Deadline(String description, String by) {
//        super(description);
//        this.by = by;
//    }
//}

public class Deadline extends Todo {

    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getBy() {
        return by;
    }

    @Override
    /**
     * this could just be solved with super.toString()
     */
    public String toString() {
        String status = this.isDone?"Yes":"No";
        return "description: " + this.description + "\nis done? " + status + "\ndo by: " + this.by;
    }
}
