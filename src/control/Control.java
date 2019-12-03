package control;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Control {
	
	@FXML
    private Pane pane; 
	@FXML
	private ImageView image;
	

	@FXML
    public void setblur() {
		
		image.setEffect(new GaussianBlur(0));   

    }
	
	@FXML
	private void handleClose() {
	
	        System.exit(0);
	}
	
	public void focus() {
		
		image.setEffect(new GaussianBlur(20));
	}
	
}