
public class SpecLift extends Lift {

    private int load;

    public SpecLift() {
    }

    public SpecLift(String label, int type, int load) {
        super(label, type);
        this.load = load;
    }

    @Override
    public String toString() {
        return label + ", " + load + ", " + type;
    }

    public void setData() {
        StringBuilder newLabel = new StringBuilder();
        for (int i = 0; i < getLabel().length(); i++) {
            if (i % 2 == 0) {
                newLabel.append(getLabel().charAt(i));
            }
        }
        setLabel(newLabel.toString());
    }

    public int getValue() {
        if (!getLabel().contains(String.valueOf(getType()))) {
            return load;
        }
        return load + getType();
    }

}
