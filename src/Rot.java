public class Rot extends Farbe {

    public Rot(Controller controller) {
        super(controller);
        controller.setHintergrundfarbe("red");
    }

    @Override
    public void buttonA() {
        super.controller.setFarbe(new Gruen(super.controller));
    }

    @Override
    public void buttonB() {
        super.controller.setFarbe(new Blau(super.controller));
    }

    @Override
    public void buttonC() {
        super.controller.setFarbe(new Rot(super.controller));
    }
}
