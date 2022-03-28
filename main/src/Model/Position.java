package Model;

public enum Position {
    Dance("Dancer"), Rap ("Rapper"), Sing ("Singer");

    private String description;

    Position(String description) { this.description = description; }

    @Override
    public String toString() { return description; }
    }

