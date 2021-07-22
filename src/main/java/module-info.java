module org.openjfx.memorygame {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;

    opens org.openjfx.memorygame to javafx.fxml;
    exports org.openjfx.memorygame;
}
