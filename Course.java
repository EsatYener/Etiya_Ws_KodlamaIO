package KodlamaIO;

public class Course {
    private int id;
    private String name;
    private double charge;
    private int instructorId;
    private int categoryId;

    public Course(int id, String name, double charge, int instructorId, int categoryId) {
        this.id = id;
        this.name = name;
        this.charge = charge;
        this.instructorId = instructorId;
        this.categoryId = categoryId;
    }
    public Course() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Double getCharge() {
        return charge;
    }
    public void setCharge(double charge){
        this.charge = charge;
    }

    public int getInstructorId() {
        return instructorId;
    }
    public void setInstructorId(int instructorId){
        this.instructorId = instructorId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }




}
