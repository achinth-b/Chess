public abstract class Piece {
    private boolean white = true;

    // by extension, private boolean black = false;
    public boolean firstMove = true;

    public void setWhite(boolean z)
    {
        white = z;
    }

    public boolean isWhite()
    {
        return this.white;
    }

    public abstract boolean canMove(int oldX, int oldY, int newX, int newY, boolean isNewSpotEmpty);

    public abstract void movePiece();

    public abstract String drawPiece();
}
