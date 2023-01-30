/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.gameoflife;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 *
 * @author zerox
 */
public class GameOfLife {
    private boolean[][] board;
    private int rows;
    private int cols;

    public GameOfLife(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.board = new boolean[rows][cols];
    }

    public void setBoard(boolean[][] board) {
        this.board = board;
    }

    public boolean[][] getBoard() {
        return this.board;
    }

    public int countNeighbors(int row, int col) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                int r = (row + i + rows) % rows;
                int c = (col + j + cols) % cols;
                if (board[r][c]) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean[][] nextGeneration() {
        boolean[][] next = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int count = countNeighbors(i, j);
                if (board[i][j]) {
                    if (count == 2 || count == 3) {
                        next[i][j] = true;
                    } else {
                        next[i][j] = false;
                    }
                } else {
                    if (count == 3) {
                        next[i][j] = true;
                    } else {
                        next[i][j] = false;
                    }
                }
            }
        }
        return next;
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] ? "O" : ".");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        boolean[][] board = {{ false, true, false, true, false, false, false, false, false, false, false, true, false, false, true, false, false, false, false, true, true, true, true, true, true, true, false, true, true},
                            {true, false, true, false, false, true, true, false, true, true, false, false, false, true, false, false, true, false, false, true, false, true, true, true, true, false, true, false, true},
                            {false, true, false, false, false, true, true, true, false, true, true, true, false, true, true, true, true, false, false, true, false, false, true, false, true, true, true, true, false},
                            {true, false, false, false, true, true, false, false, false, false, false, true, true, true, true, false, true, true, true, true, true, false, true, true, true, true, false, false, false},
                            {false, false, true, false, true, true, true, false, false, true, false, false, true, true, true, true, true, true, false, false, false, true, true, false, false, true, true, false, true},
                            {false, false, true, false, false, false, true, true, true, true, true, true, true, true, false, true, false, true, false, true, true, false, true, false, true, true, true, false, true},
	{ true, false, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, true, false, false, true, false, true, true, true, false, false, true, true},
	{ true, false, false, true, true, true, false, false, true, false, true, false, true, false, false, true, false, false, true, true, true, true, false, true, true, true, false, true, true},
	{ true, false, false, true, false, true, false, true, false, true, false, false, false, false, true, false, true, false, false, true, true, true, false, true, true, true, false, false, false},
	{ true, false, true, true, false, true, true, false, true, false, false, false, true, false, true, true, true, true, false, true, false, false, false, true, false, true, true, false, true},
	{ true, false, false, true, true, true, false, false, false, false, false, true, false, false, false, false, true, true, true, true, false, false, true, false, false, false, false, false, true},
	{ false, true, true, false, false, false, false, true, false, false, false, false, false, true, false, true, true, false, false, false, true, true, false, true, false, false, false, true, true},
	{ false, false, true, true, true, false, true, false, false, true, false, false, true, true, true, false, true, false, true, false, false, true, true, false, false, true, false, false, true},
	{ true, true, true, false, true, false, true, true, false, true, true, true, false, true, false, true, false, false, false, false, true, false, true, false, false, true, false, true, true},
	{ true, false, true, false, true, true, true, true, false, false, true, false, true, false, false, true, false, true, true, false, true, false, true, false, true, false, false, false, false},
	{ true, true, true, true, false, false, false, true, true, true, false, false, true, false, true, true, false, false, false, true, false, false, false, false, false, false, true, false, false},
	{ true, false, true, false, false, false, true, false, false, false, true, false, false, true, true, false, true, false, false, true, false, true, true, true, false, true, true, false, false},
	{ true, true, true, true, false, false, true, true, true, true, true, true, true, true, false, false, false, false, true, true, true, true, true, false, false, false, false, false, true},
	{ true, false, false, false, false, false, false, false, true, true, true, true, true, false, false, false, false, false, true, true, false, false, false, true, true, false, true, false, true},
	{ true, true, false, false, false, false, false, false, false, false, true, false, true, false, true, true, false, true, false, true, false, true, true, false, true, false, false, true, true},
	{ false, false, true, true, false, true, true, false, true, true, true, true, true, true, false, true, false, true, false, true, true, true, false, false, false, false, true, false, false},
	{ true, true, false, true, false, false, false, true, true, false, false, true, true, true, false, false, true, true, false, true, true, false, false, false, false, true, false, false, false},
	{ false, true, true, false, true, true, false, true, true, false, true, true, false, false, true, false, false, true, true, true, false, false, true, false, true, true, false, false, false},
	{ false, false, false, true, false, false, true, true, true, false, false, true, true, true, true, true, false, true, true, false, true, true, false, true, false, false, false, true, false},
	{ false, true, false, true, false, false, true, false, true, false, true, true, false, false, true, true, false, false, false, true, false, false, false, true, false, false, true, false, false},
	{ false, false, true, false, false, false, false, false, true, false, true, true, false, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false},
	{ false, true, true, false, false, true, true, false, true, true, true, true, true, false, true, false, true, false, false, true, false, false, false, false, true, false, true, false, true},
	{ true, true, true, false, false, false, false, true, true, false, false, false, true, true, true, true, true, true, false, true, true, false, true, false, false, false, true, false, true},
	{ true, true, false, false, true, true, false, true, true, true, false, false, true, false, true, true, false, true, false, true, true, true, true, true, false, true, true, false, false}};
        
        GameOfLife game = new GameOfLife(29, 29);
        game.setBoard(board);
        System.out.println("Initial Board:");
        game.printBoard();
        
        for (int i = 1; i<=100; i++){
            
           
            System.out.println("Next Generation [" + i + "]:");
            //Thread.sleep(0);
            game.setBoard(game.nextGeneration());
            game.printBoard();
            
            System.out.flush();

        }
        
        
    }
}
