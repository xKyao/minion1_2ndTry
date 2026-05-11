module net.sympia.minion1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.sympia.minion1 to javafx.fxml;
    exports net.sympia.minion1;
}