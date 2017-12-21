public abstract class Farbe {

    protected Controller controller;

    public Farbe(Controller controller) {
        this.controller = controller;
    }

    public abstract void buttonA();
    public abstract void buttonB();
    public abstract void buttonC();

}
