package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 
 * @author marki
 * @version 1.0
 * @see Control
 *
 */
public class Main extends Application {

	private AnchorPane mypane;
	
    @Override
    public void start(Stage stage) throws IOException {
    
    	
    	
    	FXMLLoader loader = new FXMLLoader(
            getClass().getResource(
                "Vista.fxml"
            )
        );

        mypane = (AnchorPane) loader.load();

        
        stage.setTitle("BLUR FOREST");
        stage.setScene(new Scene(mypane));
        stage.show();
    }


    /**
     * arranca la aplicación
     * @param args
     */
    
    public static void main(String[] args) {
        launch(args);
    }
    
}