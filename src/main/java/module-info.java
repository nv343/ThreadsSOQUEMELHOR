module SO.ThreadsSOQUEMELHOR {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens SO.ThreadsSOQUEMELHOR to javafx.fxml;
    exports SO.ThreadsSOQUEMELHOR;
}