package ru.ssau.tk.lab_web;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {
        @Test
        public void testSum(){
            Matrix matrixFirst = new Matrix(2, 2);
            matrixFirst.setElementMatrix(1, 1, 12);
            matrixFirst.setElementMatrix(1, 2, -1);
            matrixFirst.setElementMatrix(2, 1, -5);
            matrixFirst.setElementMatrix(2, 2, 0);
            Matrix matrixSecond = new Matrix(2, 2);
            matrixSecond.setElementMatrix(1, 1, -4);
            matrixSecond.setElementMatrix(1, 2, -3);
            matrixSecond.setElementMatrix(2, 1, 15);
            matrixSecond.setElementMatrix(2, 2, 7);
            Matrix matrixThird = Matrix.sumMatrix(matrixFirst, matrixSecond);
            assertEquals(matrixThird.getElementMatrix(1, 1), 8.0);
            assertEquals(matrixThird.getElementMatrix(1, 2), -4.0);
            assertEquals(matrixThird.getElementMatrix(2, 1), 10.0);
            assertEquals(matrixThird.getElementMatrix(2, 2), 7.0);
        }

}