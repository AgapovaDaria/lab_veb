package ru.ssau.tk.lab_web;

public class Matrix {
    private int numberRows;
    private int numberColumns;
    private double[][] matrix;

    public Matrix(int rows, int columns){
        numberColumns = columns;
        numberRows = rows;
        matrix = new double[numberRows][numberColumns];
    }
    public int getNumberRows() {
        return numberRows;
    }
    public int getNumberColumns() {
        return numberColumns;
    }
    public void setElementMatrix(int numberRows,int numberColumns, double value) {
        matrix[numberRows-1][numberColumns-1]=value;
    }
    public double getElementMatrix(int numberRows, int numberColumns){
        return matrix[numberRows-1][numberColumns-1];
    }
    public static Matrix sumMatrix(Matrix a, Matrix b){
        if(a.numberRows!=b.numberRows||a.numberColumns!=b.numberColumns) {
            throw new IllegalArgumentException("Размеры матриц не совпадают, операция сложения невозможна");
        }
        Matrix c = new Matrix(a.numberRows,a.numberColumns);
        for (int i=0; i<a.numberRows; i++){
            for(int j=0; j < a.numberColumns; j++){
                c.setElementMatrix(i+1, j+1, (a.getElementMatrix(i+1, j+1) + b.getElementMatrix(i+1, j+1)));
            }
        }
    return  c;
    }
}
