import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class ContentStacked extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStages){	

		Button btOK = new Button("OK");
		btOK.setMaxSize(200, 20);

		StackPane pane = new StackPane();
		pane.getChildren().add(btOK);
		
		Scene scene = new Scene(pane);	
		primaryStages.setTitle("MyJavaFX");// Set the stage title
		primaryStages.setScene(scene);// Place the scene in the stage
		primaryStages.show();// Display the stage    
	}	
public static void main(String[] args){
		Application.launch();
	}
}
