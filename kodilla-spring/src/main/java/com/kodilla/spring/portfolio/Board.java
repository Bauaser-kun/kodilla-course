package com.kodilla.spring.portfolio;

public final class Board {
   final TaskList toDolist;
   final TaskList inProgressList;
   final TaskList doneList;

    public Board(TaskList toDolist, TaskList inProgressList, TaskList doneList) {
        this.toDolist = toDolist;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDolist;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
