package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;


public class loginFormController {
    public AnchorPane loginPanel;
    public TextField txtUserName;

    public void initialize(){

    }
    public void btnLogInOnAction(ActionEvent actionEvent) throws IOException {
      if (!txtUserName.getText().isEmpty()){


            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/view/ClientForm.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle(txtUserName.getText());
            primaryStage.setResizable(false);

            ClientFormController controller = new ClientFormController();
            controller.setClientName(txtUserName.getText()); // Set the parameter
            primaryStage.show();
            txtUserName.clear();
        }else{
            new Alert(Alert.AlertType.ERROR, "Please enter your name").show();
        }
    }
}
