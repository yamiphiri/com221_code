import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStages){		
		Button btOK = new Button("OK");
		// Label label = new Label("Hello GUI dhjwshjksdkhjdshbcsbksdhjsdhfbjsdhfjbsdklbfdskljklfdsjklfsdjklfhjklfsdhjklfhjlsdhjkdfshjkfsdhjk");
		//  Create a scene and place a label in the scene
		Scene scene = new Scene(btOK,1500,233);		
		primaryStages.setTitle("MyJavaFX");// Set the stage title
		primaryStages.setScene(scene);// Place the scene in the stage
		primaryStages.show();// Display the stage    
	}

public static void main(String[] args){
		Application.launch();
	}
}
