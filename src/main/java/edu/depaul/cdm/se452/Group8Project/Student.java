

public class Student{
    private long id;
    private String firstname,lastname;
    private Course[] courses;

    public Student(){}

    public long getID(){
        return id;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public Course[] getCourses(){
        return courses;
    }

    public void setID(long id){
        this.id = id;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setCourses(Course[] courses){
        this.courses = new Course[courses];
    }
}