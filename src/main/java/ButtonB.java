class ButtonB extends Button {
    public ButtonB(String text) { this.text = text; }
    public void display() {
        System.out.println("<< " + text + " >>");
    }
}
class TextFieldB extends TextField {
    public TextFieldB(String text) { this.text = text; }
    public void display() {
        System.out.println("{{ " + text + " }}");
    }
}
class CheckboxB extends Checkbox {
    public CheckboxB(String text) { this.text = text; }
    public void display() {
        System.out.println("(x) " + text);
    }
}
