package LearningPackages.MappingInterface;

enum UsageType {
    BUSINESS, ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS
}
public class Building  implements Mappable{
    private String name;
    private UsageType type;

    public Building(String name, UsageType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ")";
    }
    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarkers.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMarkers.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarkers.SQUARE;
            case SPORTS -> Color.YELLOW + " " + PointMarkers.DIAMOND;
            default -> Color.BLACK + " " + PointMarkers.CIRCLE;
        };

    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "usage": "%s"  """.formatted(name, type);
    }
}
