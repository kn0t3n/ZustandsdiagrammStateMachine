public class Gruen extends Farbe {

    public Gruen(Controller controller) {
        super(controller);
        controller.setHintergrundfarbe("green");
    }

    @Override
    public void buttonA() {
        super.controller.setFarbe(new Blau(super.controller));
    }

    @Override
    public void buttonB() {
        super.controller.setFarbe(new Schwarz(super.controller));
    }

    @Override
    public void buttonC() {
        super.controller.setFarbe(new Gelb(super.controller));
    }
}
