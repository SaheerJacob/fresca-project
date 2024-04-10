module com.frescaMangaement {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.frescaMangaement to javafx.fxml;
    exports com.frescaMangaement;
}