package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class SchoolPen {
    private static SchoolPen instance = new SchoolPen();
    private String id = "isn-101";
    private String brand;
    private String color;
    private String material;
    private double size;
    private int numPencils;
    private int numPens;
    private int numErasers;

    public SchoolPen(String brand, String color, String material, double size, int numPencils, int numPens, int numErasers) {
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.size = size;
        this.numPencils = numPencils;
        this.numPens = numPens;
        this.numErasers = numErasers;
    }

    public static SchoolPen getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SchoolPen[] schoolPens = new SchoolPen[4];
        schoolPens[0] = new SchoolPen();
        schoolPens[1] = new SchoolPen("Bic", "Blue", "Plastic", 10.0, 2, 1, 1);
        schoolPens[2] = SchoolPen.getInstance();
        SchoolPen myPen = new SchoolPen("isn-102", "Bic", "Blue", "Plastic", 5.5, 2, 1, 1);


        for (SchoolPen schoolPen : schoolPens) {
            System.out.println("School Pen ID: " + schoolPen.getId());
        }
    }

    public void addPencil() {
        numPencils++;
    }

    public void addPen() {
        numPens++;
    }

    public void removePencil() {
        if (numPencils == 0) {
            return;
        }  {
            numPencils--;
        }
    }

    public void removePen() {
        if (numPens == 0) {
            return;
        }  {
            numPens--;
        }
    }
}
