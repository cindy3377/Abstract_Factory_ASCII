class ButtonA extends Button {
    public ButtonA(String text) { this.text = text; }
    public void display() {
        System.out.println("+[ " + text + " ]+");
    }
}
class TextFieldA extends TextField {
    public TextFieldA(String text) { this.text = text; }
    public void display() {
        System.out.println("| " + text + " |");
    }
}
class CheckboxA extends Checkbox {
    public CheckboxA(String text) { this.text = text; }
    public void display() {
        System.out.println("[ ] " + text);
    }
}
