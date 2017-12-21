public class Gelb extends Farbe {

    public Gelb(Controller controller) {
        super(controller);
        controller.setHintergrundfarbe("yellow");
    }

    @Override
    public void buttonA() {
       System.exit(0);
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

