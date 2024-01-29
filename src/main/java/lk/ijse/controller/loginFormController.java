package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.Dto.userDto;
import lk.ijse.Model.UserModel;

import java.io.IOException;
import java.sql.SQLException;

public class loginFormController {
    public AnchorPane loginPanel;
    public TextField txtUserName;


  /*  public void btnLogInOnAction(ActionEvent actionEvent) {
        String userName = txtUserName.getText();
        try {
            userDto userDto = new userDto(userName);
            UserModel userModel = new UserModel();
            boolean isSaved = userModel.saveUser(userDto);
            if (isSaved) {
                new Alert(Alert.AlertType.CONFIRMATION, "User Saved Success!!!").show();
                clearField();
                LoadChat();
            }
        } catch (SQLException | IOException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }

    private void clearField() {
        txtUserName.setText("");
    }

    public void LoadChat() throws IOException {
        if (!txtUserName.getText().isEmpty() && txtUserName.getText().matches("[A-Za-z0-9]+")) {
            Stage primaryStage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/ClientForm.fxml"));

            ClientFormController controller = new ClientFormController();
            controller.setClientName(txtUserName.getText()); // Set the parameter
            fxmlLoader.setController(controller);

            primaryStage.setScene(new Scene(fxmlLoader.load()));
            primaryStage.setTitle(txtUserName.getText());
            primaryStage.setResizable(false);
            primaryStage.centerOnScreen();
            primaryStage.setOnCloseRequest(windowEvent -> {
                controller.shutdown();
            });
            primaryStage.show();

            txtUserName.clear();
        } else {
            new Alert(Alert.AlertType.ERROR, "Please enter your name").show();
        }

    }

   */
  public void initialize(){

  }

    public void btnLogInOnAction(ActionEvent actionEvent) throws IOException {
        if (!txtUserName.getText().isEmpty()){
            Stage primaryStage = new Stage();

            Parent root = FXMLLoader.load(getClass().getResource("/view/ClientForm.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();

            txtUserName.clear();
        }else{
            new Alert(Alert.AlertType.ERROR, "Please enter your name").show();
        }
    }
}
