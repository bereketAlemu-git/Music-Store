import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DVDCollectionApp  extends Application {
    public void start(Stage primaryStage) {
        Pane  aPane = new Pane();

        // Create the labels
        // ... ADD CODE HERE ... //
        Label label2 = new Label("Title");
        label2.relocate(10,10);
        Label label3 = new Label("Year");
        label3.relocate(220,10);
        Label label4 = new Label("Length");
        label4.relocate(290,10);

        // Create the lists
        ListView<String> titleList = new ListView<String>();
        String[]    titles = {"Star Wars", "Java is cool", "Mary Poppins", "The Green Mile"};
        titleList.setItems(FXCollections.observableArrayList(titles));
        titleList.relocate(10, 30);
        titleList.setPrefSize(200, 150);

        ListView<String> yearList = new ListView<String>();
        String[]    years = {"1978", "2002", "1968", "1999"};
        yearList.setItems(FXCollections.observableArrayList(years));
        yearList.relocate(220, 30);
        yearList.setPrefSize(60, 150);

        ListView<String> lengthList = new ListView<String>();
        String[]    lengths = {"124", "93", "126", "148"};
        lengthList.setItems(FXCollections.observableArrayList(lengths));
        lengthList.relocate(290, 30);
        lengthList.setPrefSize(60, 150);


        // ... ADD CODE HERE ... //

        // Create the buttons
        // The following code shows how to set the font,
        // background color and text color of a button:
        // b.setStyle("-fx-font: 12 arial; -fx-base: rgb(0,100,0); " +
        //     "-fx-text-fill: rgb(255,255,255);");
        //the 3 rgb values represent the red/green/blue values for the color your want
        // ... ADD CODE HERE ... //
        Button addButton = new Button("Add");
        addButton.relocate(10,190);
        addButton.setPrefSize(95,30);
        addButton.setStyle("-fx-font: 12 arial; -fx-base: rgb(0,150,0); " + "-fx-text-fill: rgb(255,255,255);");
        addButton.setDisable(false);
        addButton.setVisible(true);

        Button removeButton = new Button("Delete");
        removeButton.relocate(115,190);
        removeButton.setPrefSize(95,30);
        removeButton.setStyle("-fx-font: 12 arial; -fx-base: rgb(200,0,0); " + "-fx-text-fill: rgb(255,255,255);");
        removeButton.setDisable(false);
        removeButton.setVisible(true);

        Button Stats = new Button("Stats");
        Stats.relocate(290,190);
        Stats.setPrefSize(60,30);
        Stats.setStyle("-fx-font: 12 arial; -fx-base: rgb(255,255,255); " + "-fx-text-fill: rgb(0,0,0);");
        Stats.setDisable(false);
        Stats.setVisible(true);

        // Don't forget to add the components to the window, set the title,
        // make it non-resizable, set Scene dimensions and then show the stage
        // ... ADD CODE HERE ... //
        aPane.getChildren().addAll(titleList,yearList,
                lengthList,label2,label3,label4,addButton,removeButton,Stats);
        primaryStage.setTitle("My DVD Collection"); // Set title of window
        primaryStage.setScene(new Scene(aPane, 360,240)); // Set size of window
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
