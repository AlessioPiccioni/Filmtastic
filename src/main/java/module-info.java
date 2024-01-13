module com.piccionialessio.filmtastic {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.piccionialessio.filmtastic to javafx.fxml;
    exports com.piccionialessio.filmtastic;
}