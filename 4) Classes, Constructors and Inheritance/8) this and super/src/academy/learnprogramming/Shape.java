package academy.learnprogramming;

class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
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

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y) {
        super(x, y); // Calls to the parent constructor.
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x ,y);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}