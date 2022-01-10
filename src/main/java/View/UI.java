package View;

import Controller.Controller;

import java.util.Scanner;

public class UI {
    private Controller controller;

    public UI(Controller controller) {
        this.controller = controller;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("""
                     
                     0. Exit Program \r
                     1. Show all Movies \r
                     2. Show all Actors \r
                     3. Add a Movie \r
                     4. Add an Actor \r
                     5. Remove a Movie \r
                     6. Remove an Actor \r
                     7. Update a Movie \r
                     8. Update an Actor \r
                     9. Add Actor to Movie \r
                     10. Get top Actors \r
                    """);
            System.out.println("Enter input: ");
            int variant = scanner.nextInt();
            System.out.println("You've entered: " + variant);
            switch (variant) {
                case 0:
                    break loop;
                case 1:
                    //showMovies();
                    break;
                case 2:
                    //showActors();
                    break;
                case 3:
                    //addMovie();
                    break;
                case 4:
                    //addActor();
                    break;
                case 5:
                    //deleteMovie();
                    break;
                case 6:
                    //deleteActor();
                    break;
                case 7:
                    //updateMovie();
                    break;
                case 8:
                    //updateActor();
                    break;
                case 9:
                    //addActorToMovie();
                    break;
                case 10:
                    //getTopActors();
                    break;
            }

        }
    }

}
