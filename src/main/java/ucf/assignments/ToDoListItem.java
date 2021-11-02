/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Tyler Coleman
 */

package ucf.assignments;

import java.time.LocalDate;

public class ToDoListItem {
    boolean complete;
    String desc;
    LocalDate dueDate;
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    public boolean getComplete() {
        return complete;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getDesc() {
        return desc;
    }
}
