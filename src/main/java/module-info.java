module net.sympia.minion1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;


    opens net.sympia.minion1 to javafx.fxml;
    exports net.sympia.minion1;
    exports net.sympia.minion1.api;
}