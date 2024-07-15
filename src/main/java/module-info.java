module sample.practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.practice to javafx.fxml;
    exports sample.practice;
}