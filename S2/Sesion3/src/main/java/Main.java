import models.*;

//import models.Course;
//import models.Teacher;

public class Main {

    public static void main(String[] args) {
        System.out.println("*".repeat(13));

        Course course = new Course("Methodology and Object-Oriented Programming");
        Teacher dimitrick = new Teacher("Dimitrick Navarro");
        System.out.print("\n");
        dimitrick.teaching(course);

        System.out.println("\n" + "*".repeat(13));

        Department fia = new Department();
        fia.setName("\nFaculty of Architecture and Engineering\n");
        Teacher duran = new Teacher("Durán García");
        fia.addTeacher(duran);
        fia.addTeacher(dimitrick);
        System.out.println(fia.getName());
        for(Teacher doc : fia.getTeachers()) {
            System.out.println(doc.getName());
        }

        System.out.println("\n" + "*".repeat(13));
        Library library = new Library();
        library.addBook("Dune");
        library.addBook("Pride and Prejudice");
        library.addBook("No Longer Human");
        System.out.println("\nAVAILABLE BOOKS\n");
        for (models.Library.Book book : library.getBooks()) {
            System.out.println(book.getTitle());
        }

        System.out.println("\n" + "*".repeat(13));
        Animal animal = new Animal();
        System.out.print("Random animal: ");
        animal.makeSound();
        Animal dog = new Dog();
        System.out.print("The dog says: ");
        dog.makeSound();
    }
}
