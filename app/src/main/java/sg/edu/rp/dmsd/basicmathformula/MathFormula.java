package sg.edu.rp.dmsd.basicmathformula;

/**
 * Created by 17010603 on 17/7/2018.
 */

public class MathFormula {
    private String name;
    private String formula;
    private String type;

    public MathFormula(String name, String formula, String type) {
        this.name = name;
        this.formula = formula;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MathFormula{" +
                "name='" + name + '\'' +
                ", formula='" + formula + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
