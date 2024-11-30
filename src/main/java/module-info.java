module com.example.demo2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.seleniumhq.selenium.api;
    requires org.seleniumhq.selenium.chrome_driver;
    requires dev.failsafe.core;
    requires javafx.web;


    opens com.example.demo2 to javafx.fxml;
    exports com.example.demo2;
}