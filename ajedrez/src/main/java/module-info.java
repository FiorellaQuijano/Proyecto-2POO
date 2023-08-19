module ec.edu.espol.ajedrez {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ec.edu.espol.ajedrez to javafx.fxml;
    exports ec.edu.espol.ajedrez;
}
