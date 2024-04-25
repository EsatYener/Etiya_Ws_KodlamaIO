package KodlamaIO;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Category operations
        CategoryManager categoryManager = new CategoryManager();
        CourseManager courseManager = new CourseManager();
        InstructorManager instructorManager = new InstructorManager();

        List<Course> courses = courseManager.getAll();
        List<Category> categories = categoryManager.getAll();
        List<Instructor> instructors = instructorManager.getAll();


        System.out.println("All Categories:");
        for (Category category : categories) {
            System.out.println("ID: " + category.getId() + ", Name: " + category.getName());
        }

        System.out.println("--------------------------------------");
        // Add a new category
        Category newCategory = new Category(4, "Mobile Development");
        categoryManager.add(newCategory);
        System.out.println("\nNew Category Added:");

        // Update a category
        Category updatedCategory = new Category(1, "New Technologies");
        categoryManager.update(updatedCategory);
        System.out.println("\nCategory Updated:");

        // Delete a category
        categoryManager.delete(3);
        System.out.println("\nCategory Deleted:");
        System.out.println("--------------------------------------");
        System.out.println("All Categories:");
        for (Category category : categories) {
            System.out.println("ID: " + category.getId() + ", Name: " + category.getName());
        }


        System.out.println("--------------------------------------");



        System.out.println("\nAll Courses:");
        for (Course course : courses) {
            String categoryName = categoryManager.getCategoryNameById(course.getCategoryId());
            String instructorName = instructorManager.getInstructorNameById(course.getInstructorId());

            System.out.print("ID: " + course.getId());
            System.out.print(", Name: " + course.getName());
            System.out.print(", Charge: $" + course.getCharge());
            System.out.print(", Instructor Name: " + instructorName);
            System.out.println(", Category Name: " + categoryName);
        }

        // Add a new course
        Course newCourse = new Course(4,"Mobile Development",400,3,2);
        courseManager.add(newCourse);
        System.out.println("\nNew Course Added:");

        // Update a course
        Course updatedCourse = new Course(1, "Java Programming",200,1,1);
        courseManager.update(updatedCourse);
        System.out.println("\nCourse Updated:");

        // Delete a course
        courseManager.delete(5);
        System.out.println("\nCourse Deleted:");

        System.out.println("--------------------------------------");


        System.out.println("\nAll Courses:");
        for (Course course : courses) {
            String categoryName = categoryManager.getCategoryNameById(course.getCategoryId());
            String instructorName = instructorManager.getInstructorNameById(course.getInstructorId());

            System.out.print("ID: " + course.getId());
            System.out.print(", Name: " + course.getName());
            System.out.print(", Charge: $" + course.getCharge());
            System.out.print(", Instructor Name: " + instructorName);
            System.out.println(", Category Name: " + categoryName);
        }


        // Instructor operations

        System.out.println("--------------------------------------");
        System.out.println("\nAll Instructors:");
        for (Instructor instructor : instructors) {
            System.out.println("ID: " + instructor.getId() + ", Name: " + instructor.getName());
        }

        // Add a new Instructor
        Instructor newInstructor = new Instructor(4, "Muhammed İnan");
        instructorManager.add(newInstructor);
        System.out.println("\nNew Instructor Added:");

        // Update a Instructor
        Instructor updatedInstructor = new Instructor(3, "İrem");
        instructorManager.update(updatedInstructor);
        System.out.println("\nInstructor Updated:");

        // Delete a Instructor
        instructorManager.delete(3);
        System.out.println("\nInstructor Deleted:");
        System.out.println("--------------------------------------");
        System.out.println("\nAll Instructors:");
        for (Instructor instructor : instructors) {
            System.out.println("ID: " + instructor.getId() + ", Name: " + instructor.getName());
        }

    }
}

