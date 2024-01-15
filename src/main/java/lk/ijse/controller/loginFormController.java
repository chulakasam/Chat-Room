package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
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



    public void btnLogInOnAction(ActionEvent actionEvent) {
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
        }catch (SQLException | IOException e){
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    private void clearField() {
        txtUserName.setText("");
    }

    public void LoadChat() throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/ChatWallForm.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) loginPanel.getScene().getWindow();
        stage.setScene(scene);
    }

}
