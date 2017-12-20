
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

    private enum Zustand {
        ROT, GRUEN, GELB, BLAU
    }
    private Zustand zustand;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //---------------------------------------------
        // Eventhandler
        //---------------------------------------------    
        buttonA.setOnAction(event -> {
            switch (zustand) {
                case ROT:
                    zustand = Zustand.GRUEN;
                    break;
                case GRUEN:
                    zustand = Zustand.BLAU;
                    break;
                case GELB:
                    System.exit(0);
                    break;
                case BLAU:
                    zustand = Zustand.BLAU;
                    break;
            }
            ausgabe();
        });

        buttonB.setOnAction(event -> {
            switch (zustand) {
                case ROT:
                    zustand = Zustand.BLAU;
                    break;
                case GRUEN:
                    zustand = Zustand.GRUEN;
                    break;
                case GELB:
                    zustand = Zustand.BLAU;
                    break;
                case BLAU:
                    zustand = Zustand.ROT;
                    break;
            }
            ausgabe();
        });

        buttonC.setOnAction(event -> {
            switch (zustand) {
                case ROT:
                    zustand = Zustand.ROT;
                    break;
                case GRUEN:
                    zustand = Zustand.GELB;
                    break;
                case GELB:
                    zustand = Zustand.ROT;
                    break;
                case BLAU:
                    zustand = Zustand.ROT;
                    break;
            }
            ausgabe();
        });

        //---------------------------------------------
        // Start
        //---------------------------------------------              
        zustand = Zustand.ROT;
        ausgabe();
    }

    private void ausgabe() {
        switch (zustand) {
            case ROT:
                pane.setStyle("-fx-background-color: red");
                break;
            case GRUEN:
                pane.setStyle("-fx-background-color: green");
                break;
            case GELB:
                pane.setStyle("-fx-background-color: yellow");
                break;
            case BLAU:
                pane.setStyle("-fx-background-color: blue");
                break;
        }
    }
}
