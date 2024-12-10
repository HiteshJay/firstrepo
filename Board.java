import java.util.ArrayList;

public class Board {
    private ArrayList<ArrayList<CellState>> cells;

    public Board(int size) {
        cells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ArrayList<CellState> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(CellState.EMPTY);
            }
            cells.add(row);
        }
    }

    public Boolean updateCell(Position position, Symbol symbol) {
        if (cells.get(position.row).get(position.col) == CellState.EMPTY) {
            cells.get(position.row).set(position.col, symbol.toCellState());
            return true;
        }
        return false;
    }

    public void resetBoard() {
        for (ArrayList<CellState> row : cells) {
            for (int i = 0; i < row.size(); i++) {
                row.set(i, CellState.EMPTY);
            }
        }
    }
}

enum CellState {
    EMPTY, X, O;

    public static CellState fromSymbol(Symbol symbol) {
        return symbol == Symbol.X ? X : O;
    }
}
