package KodlamaIO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InstructorManager {
    private final List<Instructor> instructors;

    public InstructorManager() {
        instructors = new ArrayList<>();
        instructors.add(new Instructor(1, "Engin Demirog"));
        instructors.add(new Instructor(2, "Halit Enes Kalayci"));
        instructors.add(new Instructor(3, "Esat Yener"));
    }

    public List<Instructor> getAll() {
        return instructors;
    }

    public Instructor getById(int id) {
        for (Instructor instructor : instructors) {
            if (instructor.getId() == id) {
                return instructor;
            }
        }
        return null;
    }

    public void add(Instructor instructor) {
        instructors.add(instructor);
    }

    public void update(Instructor instructor) {
        for (Instructor e : instructors) {
            if (e.getId() == instructor.getId()) {
                e.setName(instructor.getName());
            }
        }
    }

    public void delete(int id) {
        Iterator<Instructor> iterator = instructors.iterator();
        while (iterator.hasNext()) {
            Instructor instructor = iterator.next();
            if (instructor.getId() == id) {
                iterator.remove();
            }
        }
    }

    public String getInstructorNameById(int instructorId) {

        for(Instructor instructor: instructors){
            if(instructor.getId()==instructorId){
                return instructor.getName();
            }

        }
        return null;
    }
}

