
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

class Controller implements Initializable {

    //---------------------------------------------
    // Membervariablen für Steuerelemente
    //--------------------------------------------- 
    @FXML
    private Button buttonA, buttonB, buttonC;
    @FXML
    private Pane pane;

    private Farbe farbe;

    public void setFarbe(Farbe farbe) {
        this.farbe = farbe;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //---------------------------------------------
        // Eventhandler
        //---------------------------------------------    
        buttonA.setOnAction(event -> {
            farbe.buttonA();
        });

        buttonB.setOnAction(event -> {
            farbe.buttonB();
        });

        buttonC.setOnAction(event -> {
            farbe.buttonC();
        });

        //---------------------------------------------
        // Start
        //---------------------------------------------              
        setFarbe(new Rot(this));
    }

    public void setHintergrundfarbe(String hintergrundfarbe) {
        pane.setStyle("-fx-background-color: " + hintergrundfarbe);
    }

}
