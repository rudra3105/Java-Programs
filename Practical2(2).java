class Matrix {
    int row, column;
    float mat[][];
    
    Matrix(int a[][]) {
        row = a.length;
        column = a[0].length;
        mat = new float[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j] = a[i][j];
            }
        }
    }
    
    Matrix() {
        row = 2;
        column = 2;
        mat = new float[row][column];
    }
    
    Matrix(int rwo, int col) {
        row = rwo;
        column = col;
        mat = new float[row][column];
    }
    
    void readMatrix() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j] = sc.nextFloat();
            }
        }
    }
    
    float[][] transpose() {
        float transpose[][] = new float[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = mat[i][j];
            }
        }
        return transpose;
    }
    
    float[][] matrixMultiplication(Matrix second) {
        float result[][] = new float[row][second.column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < second.column; j++) {
                for (int k = 0; k < column; k++) {
                    result[i][j] += mat[i][k] * second.mat[k][j];
                }
            }
        }
        return result;
    }
    
    void displayMatrix(float a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    void displayMatrix() {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    float maximum_of_array() {
        float max = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
            }