public class Main {
    public static void main(String[] args) {
        UIFactory[] factories = { new AFactory(), new BFactory() };
        String[] factoryNames = { "Style A", "Style B" };

        for (int i = 0; i < factories.length; i++) {
            System.out.println("=== " + factoryNames[i] + " ===");
            showUI(factories[i]);
            System.out.println();
        }
    }

    public static void showUI(UIFactory factory) {
        Button btn = factory.createButton("Click me");
        TextField tf = factory.createTextField("Enter name");
        Checkbox cb = factory.createCheckbox("Subscribe");

        btn.display();
        tf.display();
        cb.display();

        btn.setText("Updated Button");
        tf.setText("New input");
        cb.setText("Agree to terms");

        System.out.println("-- After text update --");
        btn.display();
        tf.display();
        cb.display();
    }
}
