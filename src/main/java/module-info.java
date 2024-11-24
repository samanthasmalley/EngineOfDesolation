module EngineOfDesolation {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.media;
    requires java.desktop;

    requires google.api.services.sheets.v4.rev612;
    requires google.http.client;
    requires google.http.client.jackson2;
    requires google.api.client;

    exports main to javafx.graphics;

}