package application;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Controller {
	@FXML
	public ImageView refugees;

	private Ellipse ceiling;
	public AnchorPane page;
	public Scene scene;

	public Stage sendStage;

	@FXML
	public void showSendProfile() {
		try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("Aparte.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Cooick2");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);
            
            sendStage.show();
            
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class SetBlur {

		@FXML
		private ImageView carne;
		
		@FXML
		public void initialize() {
			carne.setEffect(new GaussianBlur(50));
		}
	}

	@FXML
	private void handleSend() {
		showSendProfile();
	}

	@FXML
	private void handleClose() {

		System.exit(0);
	}
}