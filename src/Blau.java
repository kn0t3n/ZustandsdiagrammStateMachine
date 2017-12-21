public class Blau extends Farbe {

    public Blau(Controller controller) {
        super(controller);
        controller.setHintergrundfarbe("blue");
    }

    @Override
    public void buttonA() {
        super.controller.setFarbe(new Blau(super.controller));
    }

    @Override
    public void buttonB() {
        super.controller.setFarbe(new Rot(super.controller));
    }

    @Override
    public void buttonC() {
        super.controller.setFarbe(new Gruen(super.controller));
    }
}
