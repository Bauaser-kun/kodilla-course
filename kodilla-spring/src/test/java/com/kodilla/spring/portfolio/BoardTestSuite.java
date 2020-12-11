package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("New task to do");
        board.getInProgressList().getTasks().add("New task in progress");
        board.getDoneList().getTasks().add("Finally Done");
        //Then
        Assertions.assertEquals("New task to do", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("New task in progress", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("Finally Done", board.getDoneList().getTasks().get(0));

        System.out.println(board.getToDoList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));
        System.out.println(board.getDoneList().getTasks().get(0));

    }
}
