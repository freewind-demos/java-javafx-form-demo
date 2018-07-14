package demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        Pane root = new Pane() {{
            getChildren().add(createForm());
        }};
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    private Node createForm() {
        return new GridPane() {{
            setHgap(10);
            setVgap(10);
            setPadding(new Insets(0, 10, 0, 10));

            add(new Label("Username"), 0, 0);
            add(new TextField("myname"), 1, 0);
            add(new Label("Password"), 0, 1);
            add(new PasswordField(), 1, 1);
            add(new Button("Login") {{
                setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent event) {
                        new Alert(Alert.AlertType.INFORMATION, "Login now").showAndWait();
                    }
                });
            }}, 1, 2);
        }};
    }
}