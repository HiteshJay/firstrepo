public enum Symbol {
    X, O;

    public CellState toCellState() {
        return this == X ? CellState.X : CellState.O;
    }
}
