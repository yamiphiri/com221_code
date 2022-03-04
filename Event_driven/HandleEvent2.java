import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
//can an inner class have amain method


 public class HandleEvent2 extends Application {
     @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane and set its properties        
        VBox pane = new VBox();
        pane.setAlignment(Pos.CENTER);
        TextField Display = new TextField();
        Button generateRandom = new Button("Generate");
        generateRandom.setMinSize(200, 100);
        Display.setMinSize(1202,123);
        Display.setFont(Font.font("Arial", FontWeight.BOLD,70));
    

        generateRandom.setOnAction(new EventHandler <ActionEvent>() {             
            public void handle(ActionEvent e) {                
                Display.setText(String.valueOf(Math.random()));
            }            
        });

       
        pane.getChildren().addAll(Display, generateRandom);
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

//  class CancelHandlerClass implements EventHandler<ActionEvent> {
//     double random;
//      @Override
     
//     public void handle(ActionEvent e) {
//         System.out.println("Cancel button clicked");
//     }
// }

