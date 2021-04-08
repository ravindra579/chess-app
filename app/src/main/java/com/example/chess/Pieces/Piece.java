package com.example.chess.Pieces;
import com.example.chess.Coordinates;
import com.example.chess.Position;
import java.util.ArrayList;

public class Piece {

    private boolean white;

    Piece(boolean white) {
        this.white = white;
    }

    public ArrayList<Coordinates> AllowedMoves(Coordinates coordinates , Position[][] board){
        ArrayList<Coordinates> allowedMoves = new ArrayList<>();
        Coordinates c;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                c = new Coordinates(i,j);
                allowedMoves.add(c);
            }
        }
        return allowedMoves;
    }

    public boolean isWhite() {
        return white;
    }
}
