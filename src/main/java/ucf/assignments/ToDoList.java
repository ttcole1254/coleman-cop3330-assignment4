/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Tyler Coleman
 */

package ucf.assignments;

import java.time.LocalDate;
import java.util.Collection;

public class ToDoList {
    Collection<ToDoListItem> toDoListItems;
    public void addItem(String desc, LocalDate dueDate, boolean complete) {
        /*
            Creates a new toDoListItem
            Sets the parameters: description, due date, and complete boolean
            Adds the new item to the collection
         */
    }
    public void removeItem(String desc) {
        /*
            New iterator<toDoListItem> i
            Loop while i has something
            If the description matches, assume valid match
            Remove i
         */
    }
    public Collection<ToDoListItem> getToDoListItems() {
        return toDoListItems;
    }
}
