package gr.aueb.cf.ch14.immutable;

public final class ImmutablePoint {
    private final int x;
    private final int y;

    public ImmutablePoint() {
        x = 0;
        y = 0;
    }

    public ImmutablePoint(int x, int y) { //values will remain immutable after initializing
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
