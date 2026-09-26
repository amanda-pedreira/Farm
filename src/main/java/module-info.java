module br.com.amandaluanapedreira {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.amandaluanapedreira to javafx.fxml;
    exports br.com.amandaluanapedreira;
}
