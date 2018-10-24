import java.awt.*;

class Rectangle extends Shape {
    protected Point start;
    protected int length;
    protected int width;

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(start.x, start.y, width, length);
    }

    @Override
    public void move() {
        this.start.x += this.velocity.x;
        this.start.y += this.velocity.y;

        if (this.start.x <= 0 || this.start.x + this.width >= Diagram.WIDTH) {
            this.velocity.x = -this.velocity.x;
        }

        if (this.start.y <= 0 || this.start.y + this.length >= Diagram.HEIGHT) {
            this.velocity.y = -this.velocity.y;
        }

    }

    @Override
    public String toString() {
        return String.format("Rectangle[%s]", this.start);
    }
}
