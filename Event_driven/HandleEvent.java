import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
 public class HandleEvent extends Application {
     @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        
        VBox pane = new VBox();
        pane.setAlignment(Pos.CENTER);

        Button btOK = new Button("OK");
        Button btCancel = new Button("Cancel");
        // OKHandlerClass handler1 = new OKHandlerClass();
        btOK.setOnAction(new OKHandlerClass());
        // CancelHandlerClass handler2 = new CancelHandlerClass();
        btCancel.setOnAction(new CancelHandlerClass());

        class OKHandlerClass implements EventHandler<ActionEvent> {
            @Override
           public void handle(ActionEvent e) {
               System.out.println("OK button clicked");
           }
       }
        class CancelHandlerClass implements EventHandler<ActionEvent> {
            @Override
           public void handle(ActionEvent e) {
               System.out.println("Cancel button clicked");
           }
       }


        pane.getChildren().addAll(btOK, btCancel);
         // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("HandleEvent"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    }
     public static void main(String[] args) {
        Application.launch(args);
    }
}


