/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Tyler Coleman
 */

package ucf.assignments;

public class AppModel {
    public void loadAll() {
        /*
            Read from allLists file
            New file array File[] lists = allLists listFiles
            Run loadList(filename)
         */
    }
    public void saveAll() {
        /*
            For each list in toDoList
            Run saveList(currentToDoList.getTitle)
         */
    }
    public void addList() {
        /*
            New list
            New string newTitle = ""
            Check to ensure the list doesn't already exist
            Add the new list to the main toDoList
         */
    }
    public void loadList(String file) {
        /*
            String fullPath on disk using string builder, .csv file
            New toDoList loadedList
            setTitle loadedList
            While file has next
                New string data = file next
                New string[] listItem = data.split(",")
                loadedList.addItem(listItem[0], listItem[1], etc...)
            toDoList.add(loadedList)
            Add error handling
         */
    }
    public void saveList(String list) {
        /*
            Use FileWriter using filename
            For each item in list toDoItems
                Add to file desc, duedate, completed
         */
    }
    public void deleteList(String list) {
        /*
            New iterator<toDoList> i of toDoList
            Loop as long as i has something
            Remove i
         */
    }
    public void completeItem(String list, String desc) {
        /*
            New iterator<toDoList> i of todoList
            Loop as long as i has something
            If title matches
                new iterator<toDoItems> items of the list in question
                Loop while items has something
                If match, mark complete
         */
    }
}
