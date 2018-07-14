package demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        StackPane root = new StackPane() {{
            getChildren().add(createForm());
        }};
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    private Node createForm() {
        return new VBox() {{
            getChildren().addAll(
                    new Label("Username"),
                    new TextField("myname"),
                    new Label("Password"),
                    new PasswordField(),
                    new Button("Login") {{
                        setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent event) {
                                new Alert(Alert.AlertType.INFORMATION, "Login now").showAndWait();
                            }
                        });
                    }}
            );
        }};
    }
}