public class Counter {

    private int value = 0;

    public Counter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int increase(){
        return (this.value++);

    }

    public int decrease(){
        if(value == 0)
            System.out.println("La variabile contatore non può essere minore di 0.");

        else
            this.value--;

        return value;
    }

    public int reset(){
        this.value = 0;
        return value;
    }
}
