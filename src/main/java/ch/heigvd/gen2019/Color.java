package ch.heigvd.gen2019;

public abstract class Color {
    public Color(){

    }
}

class Red extends Color {
    Red(){
        super();
    }

    public String toString ( ){ return "red"; }
}


class Blue extends Color {
    Blue(){
        super();
    }

    public String toString ( ){ return "blue"; }
}

class Yellow extends Color {
    Yellow(){
        super();
    }

    public String toString ( ){ return "yellow"; }
}

class NoColor extends Color {
    NoColor(){
        super();
    }

    public String toString ( ){ return "no color"; }
}