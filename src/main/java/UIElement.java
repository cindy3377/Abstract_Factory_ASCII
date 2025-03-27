abstract class UIElement {
    protected String text;
    public abstract void display();
    public void setText(String text) { this.text = text; }
}

abstract class Button extends UIElement {}
abstract class TextField extends UIElement {}
abstract class Checkbox extends UIElement {}
