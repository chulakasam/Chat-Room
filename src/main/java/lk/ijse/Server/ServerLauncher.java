package lk.ijse.Server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ServerLauncher extends Application {
    @Override
    public void start(Stage pstage) throws Exception {

       Parent root=FXMLLoader.load(getClass().getResource("/view/ServerForm.fxml"));

        Scene scene = new Scene(root);
        pstage.setScene(scene);
        pstage.setTitle("Server");
        pstage.centerOnScreen();
        pstage.setResizable(false);
        pstage.show();

        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(pstage.getScene().getWindow());
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/loginForm.fxml"))));
        stage.setTitle("EChat");
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
