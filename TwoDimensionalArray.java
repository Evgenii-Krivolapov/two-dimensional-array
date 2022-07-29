package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';
    public static final char whitespace = ' ';


    public static char[][] getTwoDimensionalArray(int size) {
        char[][] sizeArray = new char [size][size];
        for(int i = 0; i < sizeArray.length; i++){
            System.out.println("");
            for (int j = 0; j < sizeArray[i].length; j++){
                if(i == j || j == sizeArray.length - 1 - i)
                    sizeArray[i][j]  = SYMBOL;
                else sizeArray[i][j] = whitespace;

            }
        }

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        return sizeArray;
    }
}

