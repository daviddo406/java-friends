import controller.MovementController;
import view.View;
import controller.InteractableController;

public class Main {
    public static void main(String[] args) {
        View view = new View();

        InteractableController interactable = new InteractableController(view.root);
        view.addMouseListener(interactable);
        view.addMouseMotionListener(interactable);

        MovementController movement = new MovementController(view);
        view.addMouseListener(movement);
        movement.start();
    }
}