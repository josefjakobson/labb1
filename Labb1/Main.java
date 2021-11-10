package Labb1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<ArrayList<String>> grid = createGrid();


    }

    private static ArrayList<ArrayList<String>> createGrid() {
        ArrayList<ArrayList<String>> grid = new ArrayList<>();

        for (int i = 1; i <= 8; i++){
            ArrayList<String> row = new ArrayList<>();
            for (int j = 1; j <= 8; j++){
                row.add(" ");
            }
            grid.add(row);
        }

        return grid;
    }
}
