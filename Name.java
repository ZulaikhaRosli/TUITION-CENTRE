public class Name {

    private String fname;
    private String lname;
    private String mname;

    public void setName(String fname, String mname, String lname){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;

    }


   public void setFName(String fname) {
        // "this" refers to the class attributes
        this.fname = fname;
    }

    public void setMName(String mname) {
        // "this" refers to the class attributes
        this.mname = mname;
    }

    public void setLName(String lname) {
        // "this" refers to the class attributes
        this.lname = lname;
    }
}

