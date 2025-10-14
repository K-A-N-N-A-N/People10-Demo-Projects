public class ByThrees implements interClass { // Interace handles only method declaration, no method body
    int val1;

    ByThrees () {
        val1 = 0;
    }

    public int getNext() {
        val1 += 3;
        return val1;
    }
}