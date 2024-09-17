abstract class Instrument {
    abstract void play();
    abstract String what();
    abstract void adjust();
}
class Wind extends Instrument {
    @Override
    void play() {
        System.out.println("Wind instrument is playing.");
    }

    @Override
    String what() {
        return "Wind Instrument";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting wind instrument.");
    }
}
class Percussion extends Instrument {
    @Override
    void play() {
        System.out.println("Percussion instrument is playing.");
    }

    @Override
    String what() {
        return "Percussion Instrument";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting percussion instrument.");
    }
}
class Stringed extends Instrument {
    @Override
    void play() {
        System.out.println("Stringed instrument is playing.");
    }

    @Override
    String what() {
        return "Stringed Instrument";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting stringed instrument.");
    }
}
class Woodwind extends Wind {
    @Override
    void play() {
        System.out.println("Woodwind instrument is playing.");
    }

    @Override
    String what() {
        return "Woodwind Instrument";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting woodwind instrument.");
    }
}
class Brass extends Wind {
    @Override
    void play() {
        System.out.println("Brass instrument is playing.");
    }

    @Override
    String what() {
        return "Brass Instrument";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting brass instrument.");
    }
}
public class Orchestra {
    public static void main(String[] args) {
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Woodwind(),
            new Brass()
        };

        for (Instrument instrument : orchestra) {
            instrument.play();
            System.out.println(instrument.what());
            instrument.adjust();
            System.out.println();
        }
    }
}
interface Playable {
    void play();
    void adjust();
}
class NestedClassExercise {
    class InnerInstrument implements Playable {
        @Override
        public void play() {
            System.out.println("Playing inner instrument.");
        }

        @Override
        public void adjust() {
            System.out.println("Adjusting inner instrument.");
        }
    }

    public static void main(String[] args) {
        NestedClassExercise exercise = new NestedClassExercise();
        InnerInstrument inner = exercise.new InnerInstrument();
        inner.play();
        inner.adjust();
    }
}