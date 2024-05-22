package classes;

public class NotaDePlata implements NotaDePlataAbstract{
    private float total;

    @Override
    public float getTips() {
        return tips;
    }

    private float tips;

    public NotaDePlata(float total, float tips) {
        this.total = total;
        this.tips = tips;
    }

    public float getTotal() {
        return total;
    }

    @Override
    public void printareNota() {
        System.out.println("Nota are un total de " + this.total +
                " ron si timps de " + this.tips + " ron");
    }

}
