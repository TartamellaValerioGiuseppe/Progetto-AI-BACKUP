/**
 * 
 */
/**
 * 
 */
module AI_System_Analyzer {
}

module Application {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson; // se usi Gson
    requires oshi.core;        // se usi OSHI

    opens Application to javafx.fxml; // permette a FXML di accedere alle classi
    exports Application;             // esporta il pacchetto principale
}
