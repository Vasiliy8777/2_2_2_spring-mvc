package model;


public class Car {
private int id;
private String kind;
private String model;

public Car() {
}

public Car(int id, String kind, String model) {
    this.id = id;
    this.kind = kind;
    this.model = model;
}

public int getId() {
    return id;
}

public String getKind() {
    return kind;
}

public String getModel() {
    return model;
}
}

