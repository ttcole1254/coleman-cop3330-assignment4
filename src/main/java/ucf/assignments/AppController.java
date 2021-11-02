/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Tyler Coleman
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class AppController {

    public void initialize(URL url, ResourceBundle bundle) {
        /*
            Define appModel
            Initialize the table columns
            Pull items to do
         */
    }
    @FXML
    public void refreshLists() {
        /*
            If existing entries in UI, remove all lists
            Add each to do lists' appModel title to todolist object
            Add all to the toDoLV
         */
    }
    @FXML
    public void refreshItems() {
        /*
            Empty the table's view to clear existing
            Enter all items from getToDoItems into the table's view
         */
    }
    @FXML
    public void clickToDoList(MouseEvent mouseEvent) {
        /*
            String clickedToDoList = toDoLV
            Sets currentToDoList = appModel, gets toDoList title
            Refresh the table's view
         */
    }
    @FXML
    public void btnLoadClick(ActionEvent actionEvent) {
        // Run loadAll() from the AppModel file
    }
    @FXML
    public void btnSaveClick(ActionEvent actionEvent) {
        // Run saveAll() from the AppModel file
    }
    @FXML
    public void btnNewListClick(ActionEvent actionEvent) {
        // Run addList() from the AppModel file
    }
    @FXML
    public void btnSaveListClick(ActionEvent actionEvent) {
        // Run saveList(currentToDoList.getTitle) from the AppModel file
    }
    @FXML
    public void btnDeleteListClick(ActionEvent actionEvent) {
        // Run deleteList(currentToDoList.getTitle) from the AppModel file
    }
    @FXML
    public void btnNewItemClick(ActionEvent actionEvent) {
        // Run newItem(currentToDoList.getTitle, description, dueDate, completed) from the ToDoList file
    }
    @FXML
    public void btnDeleteItemClick(ActionEvent actionEvent) {
        // Run deleteItem(currentToDoList.getTitle, description) from ToDoList file
    }
    @FXML
    public void btnMarkCompletedClick(ActionEvent actionEvent) {
        // Run completeItem(currentToDoList.getTitle, description) from AppModel file
    }
}
