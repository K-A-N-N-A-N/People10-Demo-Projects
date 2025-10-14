class Engine {}
class Car {
    private Engine engine = new Engine(); // tightly coupled
}

class Engine {}
class Car {
    private Engine engine;
    public Car(Engine engine) {  // dependency is injected
        this.engine = engine;
    }
}
